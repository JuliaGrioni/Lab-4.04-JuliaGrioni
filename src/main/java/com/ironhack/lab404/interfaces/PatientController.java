package com.ironhack.lab404.interfaces;

import com.ironhack.lab404.model.Patient;

public interface PatientController {
    void addPatient(Patient patient);
    Patient updatePatient(int patientId, Patient patient);
}
