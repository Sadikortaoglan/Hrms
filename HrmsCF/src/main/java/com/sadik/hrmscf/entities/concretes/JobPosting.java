package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.validation.constraints.Size;
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

    @Column(name="activate",nullable = true)
    private boolean activate;

    @Column(name="approval_status")
    private boolean approvalStatus;

    @Size(max = 200)
    @Column(name="job_decription",nullable = false,length=1000)
    private String jobDescription;

    @JsonIgnore
    @Column(name="created_at")
    private LocalDate createdAt=LocalDate.now();

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
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private City city;

    @ManyToOne
    @JoinColumn(name="profession_id")
    private Profession profession;


    @ManyToOne
    @JoinColumn(name="working_id")
    private WorkingType workingType;

    @ManyToOne
    @JoinColumn(name="working_time")
    private WorkingTime workingTime;


}
