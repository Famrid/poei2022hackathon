package com.freestack.spring.Consultation;

import com.freestack.spring.Doctor.Doctor;
import com.freestack.spring.Patients.Patient;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ConsultationId implements Serializable {

    private Doctor doctor;
    private Patient patient;
    private LocalDateTime timeslot;

    public ConsultationId(Doctor doctor, Patient patient, LocalDateTime dateTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.timeslot = dateTime;
    }
}
