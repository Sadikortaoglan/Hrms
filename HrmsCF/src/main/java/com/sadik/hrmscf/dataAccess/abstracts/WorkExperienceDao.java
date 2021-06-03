package com.sadik.hrmscf.dataAccess.abstracts;

import com.sadik.hrmscf.entities.concretes.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkExperienceDao extends JpaRepository<WorkExperience,Integer> {

}
