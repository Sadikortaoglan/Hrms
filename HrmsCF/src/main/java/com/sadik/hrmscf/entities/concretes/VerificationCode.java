package com.sadik.hrmscf.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "verification_codes")
@NoArgsConstructor
@AllArgsConstructor
public class VerificationCode {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int userId;

    @Column(name="code")
    private String code;

    @Column(name="is_confirmed")
    private boolean isConfirmed;

    @Column(name="created_at", columnDefinition = "Date default CURRENT_DATE")
    private LocalDateTime createAt = LocalDateTime.now();

}

