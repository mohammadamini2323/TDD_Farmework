package com.companyName.config;

public class ApplicationConfig {
    public static final String APP_NAME ="TDD Framework";
    public static final String APP_VERSION ="1.0.0";
    public static final String ENV =System.getProperty("env","dev");
    public static final String BASE_URL=ENV.equals("prod")?"https://api.production.com":"https://api.development.com";
    public static final boolean ENABLE_DEBUG_LOGGING = ENV.equals("dev");

}
