package com.waszczyk.ceterisparibus.model;

import java.util.List;

/**
 * Created by Mr Phi on 2015-03-13.
 */
public class OandaCandleHolder<T extends AbstractOandaCandle> {

    private String instrument;
    private String granularity;

    // here must be candles variable because there is from the JSON dataa
    private List<T> candles;

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

    public List<T> getCandles() {
        return candles;
    }

    public void setCandles(List<T> oandaCandles) {
        this.candles = oandaCandles;
    }
}
