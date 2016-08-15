package com.waszczyk.ceterisparibus.datafeeds;

import com.google.gson.Gson;
import com.waszczyk.ceterisparibus.model.OandaCandleHolderUsdChfM15;
import com.waszczyk.ceterisparibus.model.UsdChf_M15_Oanda;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

@EnableScheduling
public class OandaDataFeedUsdChfM15 {

    private static final Logger LOG = Logger.getLogger(OandaDataFeedUsdChfM15.class);

    private String instrument;
    private Integer count;
    private String granularity;

    public OandaDataFeedUsdChfM15(String instrument, Integer count, String granularity){
        this.instrument = instrument;
        this.count = count;
        this.granularity = granularity;
        LOG.info("Constructor OandaDataFeedUsdChfM15");
    }

    public OandaDataFeedUsdChfM15(){}

    @Scheduled(cron = "*/22 */15 * * * ?")
    private void connectToServer() throws IOException, URISyntaxException, InterruptedException {
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
        parse(jsonObject);

    }

    private void parse(String jsonData) throws URISyntaxException, InterruptedException, IOException {
        Gson gson = new Gson();
        OandaCandleHolderUsdChfM15 myOandaCandleHolderUsdChfM15 = gson.fromJson(jsonData, OandaCandleHolderUsdChfM15.class);

        UsdChf_M15_Oanda candle =  myOandaCandleHolderUsdChfM15.getCandles().get(0);
    }
}