package com.stackrout.programs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createPattern() {
        String expectedValue[][]={{"WW|BB|","WW|BB|","WW|BB|","WW|BB|"},
                                 {"BB|WW|","BB|WW|","BB|WW|","BB|WW|"},
                                 {"WW|BB|","WW|BB|","WW|BB|","WW|BB|"},
                                     {"BB|WW|","BB|WW|","BB|WW|","BB|WW|"},
                                 {"WW|BB|","WW|BB|","WW|BB|","WW|BB|"},
                                     {"BB|WW|","BB|WW|","BB|WW|","BB|WW|"},
        {"WW|BB|","WW|BB|","WW|BB|","WW|BB|"},
            {"BB|WW|","BB|WW|","BB|WW|","BB|WW|"}};
        String actualValue[][]=app.createPattern(8,4);
        assertArrayEquals(expectedValue,actualValue);
    }
}