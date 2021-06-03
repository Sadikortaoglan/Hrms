package com.sadik.hrmscf.dataAccess.abstracts;

import com.sadik.hrmscf.entities.concretes.CurriculumVitae;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae,Integer>
{
    CurriculumVitae findById(int id);

}
