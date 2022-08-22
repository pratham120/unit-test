package com.example.patientmanagementsystem.repository;

import com.example.patientmanagementsystem.model.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, Integer>{
}
