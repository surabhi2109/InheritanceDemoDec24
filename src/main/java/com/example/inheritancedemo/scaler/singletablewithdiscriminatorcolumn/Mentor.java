package com.example.inheritancedemo.scaler.singletablewithdiscriminatorcolumn;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "stwdc_mentor")
@DiscriminatorValue(value = "2")
public class Mentor extends User {
    String company;
    int avgRating;
}
