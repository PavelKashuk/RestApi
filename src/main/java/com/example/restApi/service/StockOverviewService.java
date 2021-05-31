package com.example.restApi.service;

import com.example.restApi.entity.OverviewResponseEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import com.example.restApi.repository.StockOverviewRepository;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class StockOverviewService {

    @Autowired
    private RestTemplate restTemplate;

    public OverviewResponseEntity getAllList() throws JsonProcessingException {
        String url =
                "https://api-joch.brickx.software/api/apiservice.svc/stockactualoverview?apikey=7ed20066-a436-4999-88c0-cec6f17f51fd";
        HttpHeaders headers = new HttpHeaders();
//        headers.set("apikey", "7ed20066-a436-4999-88c0-cec6f17f51fd");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate
                .exchange(url, HttpMethod.GET, entity, String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        OverviewResponseEntity readValue =
                mapper.readValue(response.getBody(), new TypeReference<OverviewResponseEntity>() {});
        if (response.getStatusCode() == HttpStatus.OK) {
            return readValue;
        }
        else {
            System.out.println("Error");
        }
        return null;
    }
}
