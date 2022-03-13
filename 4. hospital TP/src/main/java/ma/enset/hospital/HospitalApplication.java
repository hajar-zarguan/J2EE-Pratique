package ma.enset.hospital;
import ma.enset.hospital.entities.*;
import ma.enset.hospital.repositories.ConsultationRepository;
import ma.enset.hospital.repositories.MedecinRepository;
import ma.enset.hospital.repositories.PatientRepository;
import ma.enset.hospital.repositories.RendezVousRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.stream.Stream;


@SpringBootApplication
public class HospitalApplication  {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}
	CommandLineRunner start(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository , ConsultationRepository consultationRepository){
		return  args -> {

			patientRepository.save(new Patient( null,"", false, new Date(), null, null));
			Stream.of("hajar","yassin","salah").forEach(name-> {
			Patient patient = new Patient() ;
			patient.setNom(name);
			patient.setMalade(false);
			patient.setDateNaissance(new Date());
			patient.setEmail("em");
			patientRepository.save(patient);

			});

			Stream.of("Issam","Abdeljalil","hafsa").forEach(name-> {
				Medecin medecin = new Medecin() ;
				medecin.setNom(name);
				medecin.setEmail("em");
				medecin.setSpecialiste("cardiologue");
				medecinRepository.save(medecin);

			});
			Patient patient = patientRepository.findByNom("salah");
			Patient patient1 = patientRepository.findById(1L).orElse(null);
			Medecin medecin = medecinRepository.findByNom("hafsa");
			RendezVous rendezVous = new RendezVous() ;
			rendezVous.setDateRendezVous(new Date());
			rendezVous.setAnnulee(false);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient1);
			rendezVous.setStatusRDV(StatutRDV.PENDING);
			rendezVousRepository.save(rendezVous);
			RendezVous rendezVous1 = rendezVousRepository.findById(1L).orElse(null);
			Consultation consultation = new Consultation();
			consultation.setRapportConsultation("R");
			consultation.setRendezVous(rendezVous1);
			consultation.setPrixConsultation(230.78);
			consultation.setDateConsultation(new Date());
			consultationRepository.save(consultation);
			rendezVous.setConsultation(consultation);

		};

	}
}
