package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name ="schools")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "CurriculumVitae"})
@NoArgsConstructor
@AllArgsConstructor
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="school_name")
    private String schoolName;

    @Column(name="department")
    private String department;

    @Column(name="started_date")
    private LocalDate startedDate;

    @Column(name="finished_date")
    private LocalDate finishedDate;

    @Column(name="graduation_status")
    private boolean graduationStatus;

    @ManyToOne
    @JoinColumn(name="curriculum_id")
    private CurriculumVitae curriculumVitae;




}
