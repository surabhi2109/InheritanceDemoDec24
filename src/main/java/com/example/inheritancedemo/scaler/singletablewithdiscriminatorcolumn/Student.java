package com.example.inheritancedemo.scaler.singletablewithdiscriminatorcolumn;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "stwdc_student")
@DiscriminatorValue(value = "1")
public class Student extends User {
    String course;
    String batch;
}
