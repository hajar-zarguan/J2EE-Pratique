package ma.enset._3_orm_heritage.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "USERS")
@Data @NoArgsConstructor @AllArgsConstructor
public class User {

    @Id
    private String userId;

    @Column(name = "USER_NAME",unique = true , length = 200)
    private String username ;
    private String password ;
    @ManyToMany( fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Role > roles = new ArrayList<Role>();


}
