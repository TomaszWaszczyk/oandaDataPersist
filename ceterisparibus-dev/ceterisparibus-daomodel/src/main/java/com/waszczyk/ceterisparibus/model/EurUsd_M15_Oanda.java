package com.waszczyk.ceterisparibus.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="eurusd_m15_oanda")
public class EurUsd_M15_Oanda implements Serializable{

    @Id
    @SequenceGenerator(name = "EURUSD_M15_ID_GENERATOR", sequenceName = "EURUSD_M15_OANDA_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EURUSD_M15_ID_GENERATOR")
    @Column(unique = true, nullable = false)
	private Integer candle_id;
	private String time;
	private Double openBid;
	private Double openAsk;
	private Double highBid;
	private Double highAsk;
	private Double lowBid;
	private Double lowAsk;
	private Double closeBid;
	private Double closeAsk;
	private Double volume;
	private Boolean complete;

    public Integer getCandle_id() {
        return candle_id;
    }

    public void setCandle_id(Integer candleId) {
        this.candle_id = candleId;
    }

	public Double getOpenAsk() {
		return openAsk;
	}

	public void setOpenAsk(Double openAsk) {
		this.openAsk = openAsk;
	}

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

    public boolean equals(Object o){
        if(o != null && o instanceof EurUsd_M15_Oanda){
            return highBid.equals(((EurUsd_M15_Oanda) o).highBid);
        }

        return false;
    }
}
