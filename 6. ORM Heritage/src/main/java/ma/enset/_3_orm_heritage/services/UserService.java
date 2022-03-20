package ma.enset._3_orm_heritage.services;

import ma.enset._3_orm_heritage.entities.Role;
import ma.enset._3_orm_heritage.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username , String roleName );
     User authenticate(String username, String password) ;

    }
