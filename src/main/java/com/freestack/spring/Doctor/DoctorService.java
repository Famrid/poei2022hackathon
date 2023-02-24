package com.freestack.spring.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorService {

    private List<Doctor> doctors = new ArrayList<>();
    private int nextId = 1;

    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    public Doctor getDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }

    public Doctor createDoctor(Doctor doctor) {
        doctor.setId(nextId++);
        doctors.add(doctor);
        return doctor;
    }}
