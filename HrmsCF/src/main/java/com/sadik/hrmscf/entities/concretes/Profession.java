package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name ="professions")
@NoArgsConstructor
@AllArgsConstructor
public class Profession {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name ="name",nullable = false,length=100)
    private String name;

    @Column(name = "description",length=250)
    private String description;

    @Column(name ="is_active")

    private boolean isActive;

    @OneToMany(mappedBy="profession")
    @JsonIgnore
    private List<JobPosting> jobPostings;
}
