package com.sadik.hrmscf.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolWithCurriculumVitaeDto {
    private int curriculumId;
    private String schoolName;
    private String department;
    private LocalDate startedDate;
    private LocalDate finishedDate;
    private boolean graduationStatus;



}
