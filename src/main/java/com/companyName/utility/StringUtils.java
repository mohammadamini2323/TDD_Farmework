package com.companyName.utility;

public class StringUtils {
    public static String upperCase(String TEXT){
        if (TEXT==null)throw new IllegalArgumentException("string TEXT cant be null");
        return TEXT.toUpperCase();

    }
    public static String lowerCase(String TEXT){
        if (TEXT==null)throw new IllegalArgumentException("string TEXT cant be null");
        return TEXT.toLowerCase();

    }
}
