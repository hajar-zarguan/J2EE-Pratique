package com.example.demo.dao;
import com.example.demo.model.Person;
import java.util.UUID;
// lq deuxieme chose cest linterfqce dqccee qux bdd  cette inetrfqce pour inserer les donnee




public interface PersonDao {
int insertPerson(UUID id , Person person);
default  int insertPerson(Person person ){
    UUID id = UUID.randomUUID(); // with id rqndomy generqtedd
    return  insertPerson(id , person );
}





}
