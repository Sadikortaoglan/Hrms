package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name ="languages")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "curriculumVitae"})
@NoArgsConstructor
@AllArgsConstructor
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id ;

    @Column(name="language")
    private String language ;

    @Column(name="level")
    private String level ;


    @ManyToOne
    @JoinColumn(name = "curriculum_id")
    private  CurriculumVitae curriculumVitae;


}
