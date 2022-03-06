package ma.enset.hibernate.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
/// Java Bean
@Entity // obligatoire pour montrer que cette classe et persistante

@Data  // lambok va ajouter getters et setters
@NoArgsConstructor // lambok va ajouter un constructeur sans parametre
@AllArgsConstructor// lambok
@Table
public class Patient implements Serializable {
@Id // obligqtoire
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id ;
    @Column(length = 50)
    private  String nom ;
    @Temporal(TemporalType.DATE)
    private Date DateNaissance;
    @Column // facultative
    private  Boolean malade ;
    private int score ;

}
