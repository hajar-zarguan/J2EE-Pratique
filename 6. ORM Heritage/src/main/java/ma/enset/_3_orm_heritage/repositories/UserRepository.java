package ma.enset._3_orm_heritage.repositories;

import ma.enset._3_orm_heritage.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository nest pqs obligq
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
