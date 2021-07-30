package com.sadik.hrmscf.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerRegisterDto
{
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String passwordHash;
    private LocalDate dateOfBirth;
    private String identityNumber;

}
