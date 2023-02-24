package com.freestack.spring.Consultation;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultation")
public class ConsultationController  {



    @GetMapping("/{id}")
    public Consultation getConsultation(@PathVariable("id") Integer id){


        return consultation;
    }

    @PostMapping
    public void addConsultation(@RequestBody ConsultationDTO consultationDTO){




    }






}
