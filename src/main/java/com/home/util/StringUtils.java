package com.home.util;

import java.util.Objects;

public class StringUtils {
    /**
     * equals
     *
     * @param s1 s1
     * @param s2 s2
     * @return {@link boolean}
     */
    public static boolean equals(String s1, String s2) {
        return Objects.equals(s1, s2);
    }

    /**
     * is all digits
     * Check if string is not null and all the characters of string are digits
     *
     * @param string string
     * @return {@link boolean}
     */
    public static boolean isAllDigits(String string) {
        if (string == null) {
            return false;
        }
        int size = string.length();
        for (int i = 0; i < size; i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * is alphanumeric
     * Check if string is alphanumeric
     *
     * @param string string
     * @return {@link boolean}
     */
    public static boolean isAlphaNumeric(String string) {
        if (string == null) {
            return false;
        }
        int size = string.length();
        for (int i = 0; i < size; i++) {
            if (!Character.isLetterOrDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * is blank
     * Check if string is null , empty or whitespace
     *
     * @param string string
     * @return {@link boolean}
     */
    public static boolean isBlank(String string) {
        int stringLength;
        if (string == null || (stringLength = string.length()) == 0) {
            return true;
        }

        for (int i = 0; i < stringLength; i++) {
            if (!Character.isWhitespace(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * is empty
     * Check if a string is null or zero length
     *
     * @param string string
     * @return {@link boolean}
     */
    public static boolean isEmpty(String string) {
        return (string == null || "".equals(string));
    }


}
