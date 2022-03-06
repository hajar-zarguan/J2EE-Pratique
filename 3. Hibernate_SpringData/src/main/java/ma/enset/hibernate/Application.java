package ma.enset.hibernate;

import ma.enset.hibernate.entities.Patient;
import ma.enset.hibernate.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Autowired
    private PatientRepository patientRepository;
    @Override
    public void run(String... args) throws Exception {
        Date d = new Date();
        for (int i = 0; i < 100; i++) {
            patientRepository.save(new Patient(null,"Hajar" +i,d , Math.random()>0.5?true:false ,
                    (int)Math.random()*100  ));

        }


        patientRepository.save(new Patient(null,"Hiba",d , Math.random()>0.5?true:false  , 90));
        patientRepository.save(new Patient(null,"Hassan",d , Math.random()>0.5?true:false  , 15 ));
        patientRepository.save(new Patient(null, "Ali",d , Math.random()>0.5?true:false  , 9 ));


        /*
        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p->{
            System.out.println(" ID         : " + p.getId() );
            System.out.println(" Nom        : " + p.getNom() );
            System.out.println(" Est malade : " + p.getMalade());
            System.out.println(" Score      : " + p.getScore() );
        });

        Patient p = patientRepository.findById(1L).orElseThrow(()->new RuntimeException(){});
        System.out.println(p.toString());
        if (p.getMalade() == true ){
            p.setScore(30);
        }*/

        Page<Patient> patients1 = patientRepository.findAll(PageRequest.of(1,10));
        System.out.println("Totale de pages     :"+ patients1.getTotalPages());
        System.out.println("Totale des elements : "+ patients1.getTotalElements());
        System.out.println("Contenu             : "+ patients1.getContent());

        patients1.getContent().forEach(p->{
            System.out.println(" ID         : " + p.getId() );
            System.out.println(" Nom        : " + p.getNom() );
            System.out.println(" Est malade : " + p.getMalade());
            System.out.println(" Score      : " + p.getScore() );
            System.out.println("*****************************************");
        });


    }

}
