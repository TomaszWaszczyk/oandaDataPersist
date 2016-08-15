package com.waszczyk.ceterisparibus.model;

import java.util.List;


public class OandaCandleHolderGbpUsdM15 {

    private String instrument;
    private String granularity;

    // here must be candles variable because there is from the JSON dataa
    private List<GbpUsd_M15_Oanda> candles;

    public String getInstument() {
        return instrument;
    }

    public void setInstument(String instrument) {
        this.instrument = instrument;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    public List<GbpUsd_M15_Oanda> getCandles() {
        return candles;
    }

    public void setCandles(List<GbpUsd_M15_Oanda> oandaCandles) {
        this.candles = oandaCandles;
    }
}
