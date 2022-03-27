package com.example._7_mvc.web;

import com.example._7_mvc.entities.Patient;
import com.example._7_mvc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping(path =  "/index")
    public  String patient(Model model,
                           @RequestParam(name="page",defaultValue = "8") int page,
                           @RequestParam(name = "size", defaultValue = "5") int size )
    {
        Page <Patient> PagePatients = patientRepository.findAll(PageRequest.of(page,size));
        model.addAttribute("listPatients", PagePatients.getContent());
        return  "patients";
    }

}
