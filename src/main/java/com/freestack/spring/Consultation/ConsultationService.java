package com.freestack.spring.Consultation;

import com.freestack.spring.Doctor.Doctor;
import com.freestack.spring.EntityManagerFactorySingleton;
import com.freestack.spring.Patients.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class ConsultationService {
    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private EntityManager em;

    public ConsultationService() {
        this.em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    }

    public Consultation createConsultation(ConsultationDTO consultationDTO){
        if(verifSchedule(consultationDTO.getDate(), consultationDTO.getHour())){
            this.em.getTransaction().begin();


            Doctor doctor = em.find(Doctor.class, consultationDTO.getDoctor_id());
            Patient patient = em.find(Patient.class, consultationDTO.getPatient_id());



            LocalDate date = LocalDate.parse(consultationDTO.getDate());
            LocalDateTime datetime = date.atTime(consultationDTO.getHour(),0);

            Consultation consultation = new Consultation();
            consultation.setDoctor(doctor);
            consultation.setPatient_id(patient);
            consultation.setTimeslot(datetime);



            this.em.persist(consultation);
            this.em.getTransaction().commit();
            return consultation;

        }else{
            return null;
        }
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
