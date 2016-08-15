package com.waszczyk.ceterisparibus.datafeeds;

import com.google.gson.Gson;
import com.waszczyk.ceterisparibus.model.OandaCandleHolderGbpUsdM15;
import com.waszczyk.ceterisparibus.model.alarms.AlarmEntity;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@EnableScheduling
public class OandaDataFeedGbpUsdM15 {

    private static final Logger LOG = Logger.getLogger(OandaDataFeedGbpUsdM15.class);

    private String instrument;
    private Integer count;
    private String granularity;

    public OandaDataFeedGbpUsdM15(String instrument, Integer count, String granularity) {
        this.instrument = instrument;
        this.count = count;
        this.granularity = granularity;
    }

    public OandaDataFeedGbpUsdM15() {
    }

    @Scheduled(cron = "*/17 */15 * * * ?")
    private void connectToServer() throws IOException, InterruptedException {
        //Thread.sleep(1000);
        String jsonObject = "";
        HttpClient httpClient = HttpClientBuilder.create().build();
        String URI = "https://api-fxpractice.oanda.com/v1/candles?instrument=" + instrument + "&count=" + count + "&granularity=" + granularity;
        HttpUriRequest httpGet = new HttpGet(URI);
        httpGet.setHeader(new BasicHeader("Authorization", "Bearer 861521481e615b0c0af6e2163eb011c5-0844fb72267293a47c3031d50ca527ac"));
        HttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();

        if (response.getStatusLine().getStatusCode() == 200 && entity != null) {
            InputStream stream = entity.getContent();
            String line;
            BufferedReader br = new BufferedReader(new InputStreamReader(stream));
            while ((line = br.readLine()) != null) {
                jsonObject += line;
            }
        } else {
            // print error message
            String responseString = EntityUtils.toString(entity, "UTF-8");
            LOG.info(responseString);
        }
        httpClient.getConnectionManager().shutdown();
        //httpClient.getParams().
        parse(jsonObject);
    }

    private void parse(String jsonData) throws IOException {
        Gson gson = new Gson();
        OandaCandleHolderGbpUsdM15 myOandaCandleHolderGbpUsdM15 = gson.fromJson(jsonData, OandaCandleHolderGbpUsdM15.class);
    }
}
