package ma.enset._3_orm_heritage;

import ma.enset._3_orm_heritage.entities.Role;
import ma.enset._3_orm_heritage.entities.User;
import ma.enset._3_orm_heritage.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

@Bean
    CommandLineRunner start(UserService userService){
        return  args -> {
            User u = new User();
            u.setUsername("user1");
            u.setPassword("123445");
            userService.addNewUser(u);

            User u1 = new User();
            u1.setUsername("admin");
            u1.setPassword("123445");
            userService.addNewUser(u1);

            Stream.of("Student","User","ADMIN").forEach(
                    r-> {
                        Role role1 = new Role();
                        role1.setRoleName(r);
                        userService.addNewRole(role1);

                    }
            );

        userService.addRoleToUser("user1","Student");
        userService.addRoleToUser("user1","User");


        userService.addRoleToUser("admin", "ADMIN");
            userService.addRoleToUser("admin", "User");

      try{
            User user= userService.authenticate("user1","123445");
          System.out.println(user.getUserId() +"\n"+user.getUsername());
          System.out.println("Roles -> ");
          user.getRoles().forEach(r->{
              System.out.println("\t"+r.toString());
          });



      }catch (Exception e){
          e.getMessage();
      }
        };

    }

}
