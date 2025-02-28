package com.companyName.utility;


import java.io .*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class JsonUtils {
    public static String readJsonFile(String fileName) throws IOException, URISyntaxException {
        URI filePath = Objects.requireNonNull(JsonUtils.class.getClassLoader().getResource(fileName)).toURI();
       // String pad= Objects.requireNonNull(JsonUtils.class.getClassLoader().getResource(fileName)).getPath();
        return new String(Files.readAllBytes(Paths.get(filePath)));

    }
}