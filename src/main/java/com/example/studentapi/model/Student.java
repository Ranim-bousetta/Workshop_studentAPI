package com.example.studentapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private LocalDate dob;
    private int age;

    public Student() {
    }

    public Student(Long id,String name, String email, LocalDate dob, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public LocalDate getDob() {return dob;}
    public void setDob(LocalDate dob) {this.dob = dob;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

}
