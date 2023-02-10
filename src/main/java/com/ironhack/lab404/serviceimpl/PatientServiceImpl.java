package com.ironhack.lab404.serviceimpl;

import com.ironhack.lab404.model.Patient;
import com.ironhack.lab404.repository.PatientRepository;
import com.ironhack.lab404.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepository patientRepository;



    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }

    public Patient updatePatient(int patientId, Patient patient) {
        Optional<Patient> patientInfo = patientRepository.findById(patientId);

        if (!patientInfo.isPresent()) {
            throw new IllegalArgumentException("the patient doesn't exist in our database");
        } else
            patient.setPatientId(patient.getPatientId());
            patientRepository.save(patient);
        return patientInfo.get();
    }
}