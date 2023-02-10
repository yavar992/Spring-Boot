package com.yavar.springboot.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private String Address;

    public Students(long id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }

    Students(){

    }
    public long id() {
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

    public String Address() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
