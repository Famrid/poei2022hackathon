package com.freestack.spring.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorController {
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
    }

    public Doctor updateDoctor(Doctor doctor) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getId() == doctor.getId()) {
                doctors.set(i, doctor);
                return doctor;
            }
        }
        return null;
    }

    public void deleteDoctor(int id) {
        doctors.removeIf(doctor -> doctor.getId() == id);
    }
}