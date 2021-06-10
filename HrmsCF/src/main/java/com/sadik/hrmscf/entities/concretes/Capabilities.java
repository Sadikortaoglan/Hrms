package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@Table(name ="capabilities")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "CurriculumVitae"})
@NoArgsConstructor
@AllArgsConstructor
public class Capabilities {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private  int id;

    @Column(name="name", length=150)
    private  String name;

    @Column(name="type",length = 50)
    private  String type;

    @ManyToOne
    @JoinColumn(name="curriculum_id")
    private CurriculumVitae curriculumVitae;


}
