package com.galvanize.utilities;

import java.util.concurrent.TimeUnit;

public class TimeHelper {

    public static String getDurationBreakdown(long millis) {
        if(millis < 0) {
            throw new IllegalArgumentException("Duration must be greater than zero!");
        }

        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        millis -= TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
        millis -= TimeUnit.MINUTES.toMillis(seconds);
        long milliseconds = TimeUnit.MILLISECONDS.toMillis(millis);

        StringBuilder sb = new StringBuilder(64);
        sb.append(minutes);
        sb.append(":");
        sb.append(seconds);
        sb.append(":");
        sb.append(milliseconds);

        System.out.println(sb.toString());
        return(sb.toString());
    }

}
