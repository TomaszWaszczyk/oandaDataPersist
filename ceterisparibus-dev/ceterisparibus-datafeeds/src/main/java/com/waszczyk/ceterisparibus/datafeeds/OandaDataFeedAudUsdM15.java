package com.waszczyk.ceterisparibus.datafeeds;

import com.google.gson.Gson;
import com.waszczyk.ceterisparibus.model.AudUsd_M15_Oanda;
import com.waszczyk.ceterisparibus.model.OandaCandleHolderAudUsdM15;
import com.waszczyk.ceterisparibus.model.alarms.AlarmEntity;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.net.URISyntaxException;


@EnableScheduling
public class OandaDataFeedAudUsdM15 extends OandaDataFeed<AudUsd_M15_Oanda> {

    private static final Logger LOG = Logger.getLogger(OandaDataFeedAudUsdM15.class);

    public OandaDataFeedAudUsdM15(String instrument, Integer count, String granularity) {
        super(instrument, count, granularity);
        LOG.info("COnstructor OandaDataFeedAudUsdM15");
    }

    public OandaDataFeedAudUsdM15() {
        super();
    }

    protected void parse(String jsonData) throws URISyntaxException, InterruptedException, IOException {
        Gson gson = new Gson();
        OandaCandleHolderAudUsdM15 myOandaCandleHolderAudUsdM15 = gson.fromJson(jsonData, OandaCandleHolderAudUsdM15.class);


    }

    public Boolean persistAlarm(AlarmEntity commingAlarm) {
        LOG.info("Wystapil alarm: " + commingAlarm.getMessage());
        // from string to DateTime
        DateTime commingAlarmDateTime = new DateTime(commingAlarm.getDate(), DateTimeZone.UTC);
        
        LOG.info("Funkcja persistAlarm zwrocila false AUDUSD-MAX");
        return false;
    }
}

