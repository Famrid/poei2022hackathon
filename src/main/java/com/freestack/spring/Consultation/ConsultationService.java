package com.freestack.spring.Consultation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class ConsultationService {

    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerConsultation");
    EntityManager em = emf.createEntityManager();
    public Consultation saveConsultation(Consultation consultation){
        
    }

    public boolean verifSchedule(String d, Integer h){
        LocalDate date = LocalDate.parse(d);
//verif si la date du jour est SATURDAY OU SUNDAY
        if(date.getDayOfWeek() == DayOfWeek.SUNDAY || date.getDayOfWeek() == DayOfWeek.SATURDAY){
                return false;
        }

        LocalDateTime dateTime = date.atTime(h,0);

//verif de l'heure
        if(dateTime.getHour() < 9 || dateTime.getHour() > 17){
            return false;
        }
        return false;
    }




}
