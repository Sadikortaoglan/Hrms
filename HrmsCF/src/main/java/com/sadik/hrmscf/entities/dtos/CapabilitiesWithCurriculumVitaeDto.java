package com.sadik.hrmscf.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CapabilitiesWithCurriculumVitaeDto {

    private int curriculumId;
    private String capabilityName;
    private String capabilityType;

}
