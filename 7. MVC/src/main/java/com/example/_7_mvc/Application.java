package com.example._7_mvc;

import com.example._7_mvc.entities.Patient;
import com.example._7_mvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Date;
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner (PatientRepository patientRepository){
		return  args -> {
			patientRepository.save(new Patient(null,"Hassan",new Date(),false,12) );
			patientRepository.save(new Patient(null,"Hajar",new Date(),false,55) );
			patientRepository.save(new Patient(null,"Hiba",new Date(),true,32) );
			patientRepository.save(new Patient(null,"Houssam",new Date(),false,92) );

			patientRepository.findAll().forEach(patient -> {
				System.out.println(patient.getNom());
			});
						};
}
}
