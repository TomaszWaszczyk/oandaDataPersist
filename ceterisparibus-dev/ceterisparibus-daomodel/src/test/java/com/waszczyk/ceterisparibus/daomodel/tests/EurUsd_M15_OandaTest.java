package com.waszczyk.ceterisparibus.daomodel.tests;

import com.waszczyk.ceterisparibus.model.EurUsd_M15_Oanda;
import org.junit.Test;

import static org.junit.Assert.*;

public class EurUsd_M15_OandaTest {

    @Test
    public void testEquals() throws Exception {
        EurUsd_M15_Oanda c1 = new EurUsd_M15_Oanda();
        EurUsd_M15_Oanda c2 = new EurUsd_M15_Oanda();

        c1.setOpenBid(1.23432);
        c2.setOpenBid(1.23432);

        assertEquals(c1, c2);
    }

    @Test
    public void testNotEquals(){
        EurUsd_M15_Oanda c1 = new EurUsd_M15_Oanda();
        EurUsd_M15_Oanda c2 = new EurUsd_M15_Oanda();

        c1.setOpenBid(1.23432);
        c2.setOpenBid(1.23412);

        assertNotEquals(c1, c2);
    }

}