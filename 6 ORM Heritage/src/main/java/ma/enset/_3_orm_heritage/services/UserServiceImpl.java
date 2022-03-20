package ma.enset._3_orm_heritage.services;

import lombok.AllArgsConstructor;
import ma.enset._3_orm_heritage.entities.Role;
import ma.enset._3_orm_heritage.entities.User;
import ma.enset._3_orm_heritage.repositories.RoleRepository;
import ma.enset._3_orm_heritage.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
 //@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository ;



    @Override
    public User addNewUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user) ;
    }
    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public Role findRoleByRoleName(String roleName) {
        return  roleRepository.findByRoleName(roleName);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        User user = findUserByUserName( userName);
        Role role = findRoleByRoleName(roleName);
        if(user.getRoles()!=null)
        {
            user.getRoles().add(role);
            role.getUsers().add(user);

        }else System.out.println("roles null");

    }

   @Override
    public User authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
       if(user== null) throw  new RuntimeException("Inexistant");
        if (user.getPassword().equals(password)){
            return  user;

        }
          throw new RuntimeException("Bad Credential");


    }

}
