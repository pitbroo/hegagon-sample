package com.example.hexsample.infrastructure.sql.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "USERS", schema = "HEX_SAMPLE")
public class UserDb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phoneNumber;
    private String pesel;
}
