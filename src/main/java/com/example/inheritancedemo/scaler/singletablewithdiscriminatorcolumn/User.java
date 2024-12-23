package com.example.inheritancedemo.scaler.singletablewithdiscriminatorcolumn;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "stwdc_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type", discriminatorType = DiscriminatorType.INTEGER)
public class User {
    @Id
    Long id;
    String name;
    String email;
    String password;
}
