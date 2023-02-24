package com.freestack.spring.Consultation;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultation")
public class ConsultationController  {

private ConsultationService consultationService;

    public ConsultationController(ConsultationService consultationService) {
        this.consultationService = consultationService;
    }

    @PostMapping
    public ResponseEntity<Consultation> addConsultation(@RequestBody ConsultationDTO consultationDTO){
        Consultation consultation = consultationService.createConsultation(consultationDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(consultation);

    }






}
