package com.waszczyk.ceterisparibus.model;

/**
 * Created by Panta Rhei on 2015-03-04.
 */
import java.util.List;


public class OandaCandleHolderUsdJpyM15 {

    private String instrument;
    private String granularity;

    // here must be candles variable because there is from the JSON dataa
    private List<UsdJpy_M15_Oanda> candles;

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

    public List<UsdJpy_M15_Oanda> getCandles() {
        return candles;
    }

    public void setCandles(List<UsdJpy_M15_Oanda> oandaCandles) {
        this.candles = oandaCandles;
    }
}