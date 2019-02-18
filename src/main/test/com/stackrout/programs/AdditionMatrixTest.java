package com.stackrout.programs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionMatrixTest {
    AdditionMatrix app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        int[][] expectedValue={{10,10},{10,10},{10,10}};
        int[][] a={{1,2},{3,4},{5,6}};
        int[][] b={{9,8},{7,6},{5,4}};

        assertArrayEquals(expectedValue,app.add(a,b,3,2));
    }
}