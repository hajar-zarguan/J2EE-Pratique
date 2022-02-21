package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

//on commence pqr le modele dune entiteee
// une clqsse simple

public class Person {
    private UUID ID ;
    private String name ;

    public Person(@JsonProperty("id")  UUID ID, @JsonProperty("name") String name) {
        this.ID = ID;
        this.name = name;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }


}
