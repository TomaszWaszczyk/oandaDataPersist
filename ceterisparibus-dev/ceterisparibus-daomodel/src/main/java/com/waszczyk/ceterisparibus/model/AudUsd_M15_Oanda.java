package com.waszczyk.ceterisparibus.model;

import javax.persistence.*;

/**
 * Created by Panta Rhei on 2015-03-04.
 */
@Entity
@Table(name="audusd_m15_oanda")
public class AudUsd_M15_Oanda extends AbstractOandaCandle {

    @Id
    @SequenceGenerator(name = "AUDUSD_M15_ID_GENERATOR", sequenceName = "AUDUSD_M15_OANDA_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUDUSD_M15_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Integer candle_id;

    public Integer getCandle_id() {
        return candle_id;
    }

    public void setCandle_id(Integer candle_id) {
        this.candle_id = candle_id;
    }

    public boolean equals(Object o){
        if(o != null && o instanceof AudUsd_M15_Oanda){
            return openBid.equals(((AudUsd_M15_Oanda) o).openBid);
        }

        return false;
    }
}
