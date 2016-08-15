package com.waszczyk.ceterisparibus.model.asiansession;

import javax.persistence.MappedSuperclass;

/**
 * Created by Mr Phi on 2015-03-23.
 */
@MappedSuperclass
public class AbstractAssianSession {

    protected String time;
    protected Double min_asian;
    protected Double max_asian;
    protected Double delta;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getMin_asian() {
        return min_asian;
    }

    public void setMin_asian(Double min_asian) {
        this.min_asian = min_asian;
    }

    public Double getMax_asian() {
        return max_asian;
    }

    public void setMax_asian(Double max_asian) {
        this.max_asian = max_asian;
    }

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double delta) {
        this.delta = delta;
    }
}
