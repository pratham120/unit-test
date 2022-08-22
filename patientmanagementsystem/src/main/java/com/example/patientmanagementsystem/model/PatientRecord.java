package com.example.patientmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientRecord {

    @Id
    private Long patientid;
    private String name;
    private Integer age;
    private String addressfields;

    public PatientRecord(Long patientid, String name, Integer age, String addressfields) {
        this.patientid = patientid;
        this.name = name;
        this.age = age;
        this.addressfields = addressfields;
    }

    public Long getPatientid() {
        return patientid;
    }

    public void setPatientid(Long patientid) {
        this.patientid = patientid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddressfields() {
        return addressfields;
    }

    public void setAddressfields(String addressfields) {
        this.addressfields = addressfields;
    }
}
