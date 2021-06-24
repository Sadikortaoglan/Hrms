package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name ="work_experiences")

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "curriculumVitae"})
@NoArgsConstructor
@AllArgsConstructor
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="position")
    private String position;

    @Column(name="started_date")
    private LocalDate startedDate;

    @Column(name="finished_date")
    private LocalDate finishedDate;

    @Column(name="is_still_working")
    private boolean isStillWorking;

    @ManyToOne
    @JoinColumn(name = "curriculum_id")
    private  CurriculumVitae curriculumVitae;
}
