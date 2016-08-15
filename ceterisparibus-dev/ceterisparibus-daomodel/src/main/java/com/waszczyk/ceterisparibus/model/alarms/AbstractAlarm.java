package com.waszczyk.ceterisparibus.model.alarms;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Mr Phi on 2015-03-29.
 */
@MappedSuperclass
public abstract class AbstractAlarm {

    protected String date;
    protected String instrument;

    @Column(nullable = true)
    protected String message;

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

