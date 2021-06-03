package com.sadik.hrmscf.dataAccess.abstracts;

import com.sadik.hrmscf.entities.concretes.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialMediaDao extends JpaRepository<SocialMedia,Integer> {
}
