package com.stackrout.programs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class removeVowelsTest {
    removeVowels app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void remove() {
        String expectedValue[]={"Ind","Egypt"};
        String abc[]={"India","Egypt"};
        String actualValue[]=app.remove(abc);
        assertArrayEquals(expectedValue,actualValue);
    }
}