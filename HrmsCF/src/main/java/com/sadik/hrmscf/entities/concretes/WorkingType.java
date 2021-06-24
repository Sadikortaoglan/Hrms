package com.sadik.hrmscf.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "workingType")
public class WorkingType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private  int id;

    @Column(name="type",length = 50)
    private  String type;

    @OneToMany(mappedBy = "workingType")
    private List<JobPosting> jobPostings;
    


}
