package com.sadik.hrmscf.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sadik.hrmscf.core.entity.User;
import lombok.*;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@PrimaryKeyJoinColumn(name = "employer_id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobPostings"})
public class Employer extends User {

    @NotNull(message="Company name cannot be empty")
    @Column(name="company_name",nullable = false,length = 150)
    private String companyName;

    @Column(name="web_site",nullable = false,length = 150)
    private String webSite;

    @Column(name="status")
    private Boolean status;

    @OneToMany(mappedBy = "employer")
    private List<JobPosting> jobPostings;

}
