package com.waszczyk.ceterisparibus.model;

import javax.persistence.*;

/**
 * Created by Panta Rhei on 2015-03-04.
 */
@Entity
@Table(name="usdchf_m15_oanda")
public class UsdChf_M15_Oanda extends AbstractOandaCandle {

    @Id
    @SequenceGenerator(name = "USDCHF_M15_ID_GENERATOR", sequenceName = "USDCHF_M15_OANDA_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USDCHF_M15_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Integer candle_id;

    public Integer getCandle_id() {
        return candle_id;
    }

    public void setCandle_id(Integer candle_id) {
        this.candle_id = candle_id;
    }

    public boolean equals(Object o){
        if(o != null && o instanceof UsdChf_M15_Oanda){
            return openBid.equals(((UsdChf_M15_Oanda) o).openBid);
        }

        return false;
    }
}
