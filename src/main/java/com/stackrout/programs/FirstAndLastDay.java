package com.stackrout.programs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDay {
    public static String firstDay()
    {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        return df.format(c.getTime());
    }
    public static String lastDay()
    {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        for (int i = 0; i <=6; i++) {
            c.add(Calendar.DATE, 1);
        }
        return df.format(c.getTime());
    }

}
