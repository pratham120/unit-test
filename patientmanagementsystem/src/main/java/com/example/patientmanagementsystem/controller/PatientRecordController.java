package com.example.patientmanagementsystem.controller;

import com.example.patientmanagementsystem.model.PatientRecord;
import com.example.patientmanagementsystem.repository.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientRecordController {

    @Autowired
    PatientRecordRepository patientRepository;

    @GetMapping("/patient")
    public List<PatientRecord> getAllStudents() {
        return patientRepository.findAll();
    }

    // Get the student information
    @GetMapping("/patient/{patientId}")
    public PatientRecord getPatient(@PathVariable Integer patientid) {
        return patientRepository.findById(patientid).get();
    }

    // Delete the student
    @DeleteMapping("/patient/{patientid}")
    public List<PatientRecord> deletePatient(@PathVariable Integer patientid) {
        patientRepository.delete(patientRepository.findById(patientid).get());
        return patientRepository.findAll();
    }

    // Add new student
    @PostMapping("/patient")
    public List<PatientRecord> addStudent(@RequestBody PatientRecord patient) {
        patientRepository.save(patient);
        return patientRepository.findAll();
    }

    // Update the student information
    @PutMapping("/patient/{patientid}")
    public List<PatientRecord> updateStudent(@RequestBody PatientRecord patient, @PathVariable Integer patientid) {
        PatientRecord patientObj = patientRepository.findById(patientid).get();
        patientObj.setName(patient.getName());
        patientObj.setAddressfields(patient.getAddressfields());
        patientRepository.save(patientObj);
        return patientRepository.findAll();
    }

}


