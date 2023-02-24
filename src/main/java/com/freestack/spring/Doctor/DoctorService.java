package com.freestack.spring.Doctor;


import com.freestack.spring.EntityManagerFactorySingleton;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class DoctorService {
    private EntityManager em;

    public DoctorService() {
        this.em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    }

    public Doctor createDoctor(Doctor doctor) {
        this.em.getTransaction().begin();
        this.em.persist(doctor);
        this.em.getTransaction().commit();
        return doctor;
    }
}
