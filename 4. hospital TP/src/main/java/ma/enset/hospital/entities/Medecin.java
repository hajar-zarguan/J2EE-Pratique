package ma.enset.hospital.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Medecin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id ;
    private String nom;
    private  String  email ;
    private  String  specialiste ;
    @OneToMany(mappedBy = "medecin")
    private Collection <RendezVous> rendezVous;


}
