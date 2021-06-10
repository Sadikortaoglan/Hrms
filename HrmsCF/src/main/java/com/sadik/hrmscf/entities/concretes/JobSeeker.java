package com.sadik.hrmscf.entities.concretes;

import com.sadik.hrmscf.core.entity.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@PrimaryKeyJoinColumn(name = "job_seeker_id")
public class JobSeeker extends User {

    @Column(name="first_name",nullable = false,length = 100)
    private String firstName;

    @Column(name="last_name",nullable = false,length = 100)
    private String lastName;

    @Column(name="gender",nullable = false,length = 5)
    private String gender;

    @Column(name="date_of_birth",nullable = true)
    private LocalDate dateOfBirth;

    @Column(name="identity_number",nullable = false,length = 100)
    private String identityNumber;


    @OneToOne(mappedBy = "jobSeeker", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private CurriculumVitae curriculumVitae;









}
