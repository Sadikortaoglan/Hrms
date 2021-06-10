package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name="job_postings")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = {"id"})
public class JobPosting {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name="activate",nullable = false)
    private boolean activate;

    @JsonIgnore
    @Column(name="approval_status",nullable = false)
    private String approvalStatus;

    @Column(name="job_decription",nullable = false,length=1000)
    private String jobDescription;

    @Column(name="created_at")
    private LocalDate createdAt;

    @Column(name="updated_at")
    private LocalDate updatedAt;

    @Column(name="application_deadline")
    private LocalDate applicationDeadline;

    @Column(name="number_of_open_position",nullable=false)
    private int numberOfOpenPosition;

    @Column(name="number_of_application")
    private int numberOfApplication;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name="profession_id")
    private Profession profession;





}
