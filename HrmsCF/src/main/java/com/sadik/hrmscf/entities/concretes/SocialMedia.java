package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

@Data
@Entity
@Table(name ="social_media")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "CurriculumVitae"})
@NoArgsConstructor
@AllArgsConstructor
public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="type")
    private String type;

    @Column(name="link")
    private String link;

    @ManyToOne
    @JoinColumn(name="curriculum_id")
    private  CurriculumVitae curriculumVitae;


}
