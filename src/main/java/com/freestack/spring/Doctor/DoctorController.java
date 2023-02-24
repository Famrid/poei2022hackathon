package com.freestack.spring.Doctor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/doctor")
public class DoctorController {
    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor){
        Doctor persistedDoctor = this.doctorService.createDoctor(doctor);
        return ResponseEntity.status(HttpStatus.CREATED).body(persistedDoctor);
    }
}



