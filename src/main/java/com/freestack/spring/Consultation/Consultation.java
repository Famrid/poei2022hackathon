package com.freestack.spring.Consultation;

import org.springframework.stereotype.Repository;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Repository
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDateTime timeslot;

    Long doctor_id;

    Long patient_id;

    public Consultation(LocalDateTime timeslot, Long doctor_id, Long patient_id) {
        this.timeslot = timeslot;
        this.doctor_id = doctor_id;
        this.patient_id = patient_id;
    }
}
