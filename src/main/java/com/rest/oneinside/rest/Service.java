package com.rest.oneinside.rest;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;


import java.io.IOException;
import java.net.URL;


@org.springframework.stereotype.Service
public class Service {
    public String getImage() throws IOException {
        URL url = new URL("https://dog.ceo/api/breeds/image/random");

        ObjectMapper objectMapper = new ObjectMapper();
        Moodel moodel = objectMapper.readValue(url, Moodel.class);
        return moodel.getMessage();
    }

}
