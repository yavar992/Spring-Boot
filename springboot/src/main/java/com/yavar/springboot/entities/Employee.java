package com.yavar.springboot.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private  int age;

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee() {

    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
