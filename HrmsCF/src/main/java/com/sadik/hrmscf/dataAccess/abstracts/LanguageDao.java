package com.sadik.hrmscf.dataAccess.abstracts;

import com.sadik.hrmscf.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageDao extends JpaRepository<Language,Integer> {
}
