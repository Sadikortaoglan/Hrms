package com.sadik.hrmscf.entities.concretes;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@PrimaryKeyJoinColumn(name = "employer_id")
public class Employer extends User {

    @Column(name="company_name",nullable = false,length = 150)
    private String companyName;

    @Column(name="web_site",nullable = false,length = 150)
    private String webSite;

    @Column(name="status")
    private Boolean status;
}
