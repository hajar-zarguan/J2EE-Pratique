package ma.enset._3_orm_heritage.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Entity
@Table(name = "ROLES")
@Data @NoArgsConstructor @AllArgsConstructor
public class Role {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long id ;
    private  String  desc;
    @Column(name = "ROLE_NAME",unique = true , length = 200)
    private  String roleName;
    @ManyToMany(mappedBy = "roles",fetch = FetchType.EAGER)
    //@JoinTable(name = "USERS_ROLES")
    private List<User> users  = new ArrayList<User>();


}
