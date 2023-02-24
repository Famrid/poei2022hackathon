package com.freestack.spring.Patients;

import com.freestack.spring.EntityManagerFactorySingleton;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class PatientService {
    private EntityManager entityManager;

    public PatientService() {
        this.entityManager = EntityManagerFactorySingleton.getInstance().createEntityManager();
    }


    public Patient createPatient(Patient patient) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(patient);
        this.entityManager.getTransaction().commit();
        return patient;
    }
}
