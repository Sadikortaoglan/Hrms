package com.sadik.hrmscf.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperienceForCurriculumVitaeDto {

    private int curriculumId;
    private LocalDate startedDate;
    private LocalDate finishedDate;
    private boolean isStillWork;
    private String companyName;
    private String position;

}
