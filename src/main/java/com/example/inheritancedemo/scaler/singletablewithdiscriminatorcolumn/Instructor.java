package com.example.inheritancedemo.scaler.singletablewithdiscriminatorcolumn;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "stwdc_instructor")
@DiscriminatorValue(value = "3")
public class Instructor extends User {
    String specialization;
}
