package com.sadik.hrmscf.dataAccess.abstracts;

import com.sadik.hrmscf.entities.concretes.Capabilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapabilityDao extends JpaRepository<Capabilities,Integer> {
}
