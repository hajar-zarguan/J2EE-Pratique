package ma.enset.hospital.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  Long id ;
    private  String nom ;
    private  Boolean malade;
    //@Temporal(TemporalType.DATE)
    private Date dateNaissance ;
    private  String email ;
    @OneToMany(mappedBy = "patient",fetch =  FetchType.LAZY)
    private Collection<RendezVous> rendezVous ;

}
