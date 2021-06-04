package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;;
import java.time.LocalDate;

import java.util.List;

@Data
@Entity
@Table(name ="curriculum_vitaes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisements"})
@NoArgsConstructor
@AllArgsConstructor
public class CurriculumVitae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "coverletter" ,length = 2000)
    private String coverLetter;

    @Column(name = "created_date")
    private LocalDate createDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

    @OneToMany(mappedBy = "curriculumVitae")
    private List<Language> language;

    @OneToMany(mappedBy = "curriculumVitae")
    private  List<WorkExperience> workExperiences;

    @OneToMany(mappedBy = "curriculumVitae")
    private  List<SocialMedia> socialMedia;

    @OneToMany(mappedBy = "curriculumVitae")
    private  List<Capabilities> capabilities;

    @OneToMany(mappedBy="curriculumVitae")
    private  List<School> schools;

    @OneToOne
    @MapsId
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;









}
