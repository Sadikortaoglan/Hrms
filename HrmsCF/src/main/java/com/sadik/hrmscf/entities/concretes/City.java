package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "JobPosting"})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name ="city",nullable = false,length=256)
    private String city;

    @OneToMany(mappedBy="city")
    private List<JobPosting> jobPostings;

}
