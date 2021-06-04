package com.sadik.hrmscf.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

public class SocialMediaForCurriculumVitaeDto {

    private int curriculumId;
    private String type;
    private String link;


}
