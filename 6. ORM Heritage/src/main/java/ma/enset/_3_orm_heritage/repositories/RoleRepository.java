package ma.enset._3_orm_heritage.repositories;
import ma.enset._3_orm_heritage.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String  roleName);
}

