package com.sadik.hrmscf.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingForEmployerDto {
    //private int jobPostingId;
    private int employerId;
    private String jobDescription;
    private int cityId;
    private int numberOfApplication;
    private LocalDate applicationDeadline;


}
