package com.example.demo.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)   
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

    String name;

    @Column(name = "last_name")
    String lastName;

    String email;

    byte age;


}
