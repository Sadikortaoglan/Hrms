package com.sadik.hrmscf.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "working_time")
public class WorkingTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type",nullable = false,length = 50)
    private String type;

    @OneToMany(mappedBy = "workingTime")
    private List<JobPosting> jobPosting;
}
