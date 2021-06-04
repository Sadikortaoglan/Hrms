package com.sadik.hrmscf.entities.concretes;
import com.sadik.hrmscf.core.entity.User;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@PrimaryKeyJoinColumn(name = "employee_id")
public class Employee extends User {

    @Column(name="first_name",nullable = false,length = 100)
    private String firstName;

    @Column(name="last_name",nullable = false,length = 100)
    private String lastName;

    @Column(name="identity_number",nullable = false,length = 50)
    private String identityNumber;

    @Column(name="gender",nullable = false,length = 5)
    private String gender;

    @Column(name="date_of_birth",nullable = false)
    private LocalDate dateOfBirth;
}
