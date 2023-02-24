package com.freestack.spring.Consultation;

public class ConsultationDTO {
    Long doctor_id;
    Long patien_id;
    String date;
    Integer hour;

    public Long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Long getPatien_id() {
        return patien_id;
    }

    public void setPatien_id(Long patien_id) {
        this.patien_id = patien_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
