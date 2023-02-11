package com.yavar.springboot.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;


@Entity
@JsonSerialize
public class Department {
    @Id
    @GeneratedValue
    @JsonProperty("departmentId")
    private long departmentId;
    @Column
    @JsonProperty("departmentName")
    private String departmentName;
    @Column
    @JsonProperty("departmentAddress")
    private String departmentAddress;
    @Column
    @JsonProperty("departmentCode")
    private String departmentCode;

    public Department(long departmentId, String departmentName, String departmentAddress, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    public Department() {

    }

    public long departmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String departmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String departmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String departmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
