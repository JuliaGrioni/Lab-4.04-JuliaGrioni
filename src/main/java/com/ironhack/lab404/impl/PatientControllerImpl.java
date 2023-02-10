package com.ironhack.lab404.impl;

import com.ironhack.lab404.interfaces.PatientController;
import com.ironhack.lab404.model.Patient;
import com.ironhack.lab404.repository.PatientRepository;
import com.ironhack.lab404.service.PatientService;
import com.ironhack.lab404.serviceimpl.PatientServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientControllerImpl implements PatientController {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    PatientService patientService;

    @PostMapping("/patientsAdd")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPatient(@RequestBody @Valid Patient patient) {
        patientService.addPatient(patient);
    }


    @PutMapping("/patientsUpdate/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Patient updatePatient(@PathVariable int patientId, @RequestBody @Valid Patient patient) {
        patientService.updatePatient(patientId, patient);
        return patient;
    }

}
