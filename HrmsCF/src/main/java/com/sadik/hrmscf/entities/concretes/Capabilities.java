package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="capabilities")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisements"})
@NoArgsConstructor
@AllArgsConstructor
public class Capabilities {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private  int id;

    @Column(name="name", length=150)
    private  int name;

    @Column(name="type",length = 50)
    private  int type;

    @ManyToOne
    @JoinColumn(name="curriculum_id")
    private CurriculumVitae curriculumVitae;


}
