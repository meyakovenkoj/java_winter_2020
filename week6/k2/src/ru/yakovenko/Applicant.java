package ru.yakovenko;

import java.util.Date;

public class Applicant {
    private int id;
    private Date arrived;
    private Boolean status;

    public Applicant(){

    }

    public int getId() {
        return id;
    }

    public Date getArrived() {
        return arrived;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
