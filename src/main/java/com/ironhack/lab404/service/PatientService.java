package com.ironhack.lab404.service;

import com.ironhack.lab404.model.Patient;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

public interface PatientService {
    void addPatient(Patient patient);

    Patient updatePatient(int patientId, Patient patient);
}
