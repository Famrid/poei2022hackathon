package com.freestack.spring.Consultation;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultation")
public class ConsultationController  {

private ConsultationService consultationService;



    @GetMapping("/{id}")
    public ResponseEntity<Consultation> getConsultation(@PathVariable("id") Integer id) {


    }

    @PostMapping
    public void addConsultation(@RequestBody ConsultationDTO consultationDTO){




    }






}
