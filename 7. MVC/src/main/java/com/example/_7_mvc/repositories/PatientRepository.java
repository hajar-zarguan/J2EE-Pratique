package com.example._7_mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example._7_mvc.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
}
