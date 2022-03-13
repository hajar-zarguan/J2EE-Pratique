package ma.enset.hospital.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class RendezVous {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id ;
    private Date dateRendezVous ;

    @Enumerated(EnumType.STRING)
    private  StatutRDV statusRDV ;
    private  boolean annulee;

    @ManyToOne
    private  Patient patient ;

    @ManyToOne
    private  Medecin medecin ;

    @OneToOne
    private Consultation consultation ;


}
