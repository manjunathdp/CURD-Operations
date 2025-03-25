package com.mdp.CURD.model;


import jakarta.persistence.*;

@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String middleNane;
    String lastName;
}
