package ma.enset.hospital.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id ;
    private Date dateConsultation ;
    private  String rapportConsultation ;
    private  double prixConsultation;
    @OneToOne(mappedBy = "consultation")
    private  RendezVous rendezVous ;

}
