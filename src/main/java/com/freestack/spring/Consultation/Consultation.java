package com.freestack.spring.Consultation;

import com.freestack.spring.Doctor.Doctor;
import com.freestack.spring.Patients.Patient;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@IdClass(ConsultationId.class)
public class Consultation {

    @Id
    LocalDateTime timeslot;

    @Id
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    Doctor doctor;

    @Id
    @ManyToOne
    @JoinColumn(name = "patient_id")
    Patient patient_id;



    public LocalDateTime getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(LocalDateTime timeslot) {
        this.timeslot = timeslot;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Patient patient_id) {
        this.patient_id = patient_id;
    }
}
