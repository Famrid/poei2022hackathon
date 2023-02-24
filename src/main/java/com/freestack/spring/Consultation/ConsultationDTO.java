package com.freestack.spring.Consultation;

public class ConsultationDTO {
    Long doctor_id;
    Long pat;
    String date;
    Integer hour;

    public Long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Long getPat() {
        return pat;
    }

    public void setPat(Long pat) {
        this.pat = pat;
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
