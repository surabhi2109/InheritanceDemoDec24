package com.example.inheritancedemo.scaler.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mps_student")
public class Student extends User{
    String course;
    String batch;
}
