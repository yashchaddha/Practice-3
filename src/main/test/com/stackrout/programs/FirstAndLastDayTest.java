package com.stackrout.programs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayTest {
    FirstAndLastDay app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void firstDay() {
        String expectedValue="Mon 18/02/2019";
        String actualValue=app.firstDay();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void lastDay() {
        String expectedValue="Sun 24/02/2019";
        String actualValue=app.lastDay();
        assertEquals(expectedValue,actualValue);
    }

}