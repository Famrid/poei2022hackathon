package com.freestack.spring.Patients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/patient")
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        Patient persistedPatient = this.patientService.createPatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(persistedPatient);
    }
}
