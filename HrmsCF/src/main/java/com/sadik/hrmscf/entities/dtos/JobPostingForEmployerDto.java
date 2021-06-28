package com.sadik.hrmscf.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingForEmployerDto {
    private int employerId;
    private String jobDescription;
    private String city;
    private int numberOfApplication;
    private String type;
    private LocalDate applicationDeadline;


}
