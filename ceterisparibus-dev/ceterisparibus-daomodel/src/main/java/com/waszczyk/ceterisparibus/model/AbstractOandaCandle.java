package com.waszczyk.ceterisparibus.model;

import javax.persistence.MappedSuperclass;

/**
 * Created by Panta Rhei on 2015-03-04.
 */
@MappedSuperclass
public class AbstractOandaCandle {

    protected String time;
    protected Double openBid;
    protected Double openAsk;
    protected Double highBid;
    protected Double highAsk;
    protected Double lowBid;
    protected Double lowAsk;
    protected Double closeBid;
    protected Double closeAsk;
    protected Double volume;
    protected Boolean complete;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getOpenBid() {
        return openBid;
    }

    public void setOpenBid(Double openBid) {
        this.openBid = openBid;
    }

    public Double getOpenAsk() {
        return openAsk;
    }

    public void setOpenAsk(Double openAsk) {
        this.openAsk = openAsk;
    }

    public Double getHighBid() {
        return highBid;
    }

    public void setHighBid(Double highBid) {
        this.highBid = highBid;
    }

    public Double getHighAsk() {
        return highAsk;
    }

    public void setHighAsk(Double highAsk) {
        this.highAsk = highAsk;
    }

    public Double getLowBid() {
        return lowBid;
    }

    public void setLowBid(Double lowBid) {
        this.lowBid = lowBid;
    }

    public Double getLowAsk() {
        return lowAsk;
    }

    public void setLowAsk(Double lowAsk) {
        this.lowAsk = lowAsk;
    }

    public Double getCloseBid() {
        return closeBid;
    }

    public void setCloseBid(Double closeBid) {
        this.closeBid = closeBid;
    }

    public Double getCloseAsk() {
        return closeAsk;
    }

    public void setCloseAsk(Double closeAsk) {
        this.closeAsk = closeAsk;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }
}
