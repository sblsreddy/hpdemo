package com.home.util;

/**
 * Different ways of enum can be found in the below link
 * https://www.baeldung.com/java-search-enum-values
 */
public enum YesNo {

    Yes("TRUE", 1),
    No("FALSE", 2);

    private final String value;
    private final int code;

    YesNo(String value, int code) {
        this.value = value;
        this.code = code;
    }

}
