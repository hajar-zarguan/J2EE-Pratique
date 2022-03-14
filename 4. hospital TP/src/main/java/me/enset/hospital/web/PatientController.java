package me.enset.hospital.web;

import me.enset.hospital.entities.Patient;
import me.enset.hospital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/patients")
    public List<Patient> patientList(){
        return patientRepository.findAll();
    }

    @GetMapping("/patients/{id}")
    public Patient patientList(@PathVariable Long id){
        return patientRepository.findById(id).get();
    }
}
