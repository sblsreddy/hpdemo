package com.home.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringFormat {
    private static final String DEFAULT_DATE_FORMAT = "MM/dd/yyyy";

    private StringFormat() {
    }

    /**
     * date to string
     *
     * @param date              date
     * @param dateFormatPattern dateFormatPattern
     * @return {@link String}
     * @see String
     */
    public static String dateToString(Date date, String dateFormatPattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern(dateFormatPattern);
        simpleDateFormat.setLenient(false); // strict parsing
        String dateString = simpleDateFormat.format(date);
        return dateString;
    }

    /**
     * boolean to string
     * if bool is true it returns "true" and "false" for bool value false
     *
     * @param bool bool
     * @return {@link String}
     * @see String
     */
    public String booleanToString(boolean bool) {
        return Boolean.valueOf(bool).toString();
    }
}
