package com.example.Exercise.service;

import com.example.Exercise.ExerciseApplication;
import com.example.Exercise.model.Exercise;
//import com.example.Exercise.repo.ExerciseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ExerciseService {

    //Place within the application.properties file, and add @Value within this class for
    private static final String url = "https://api.api-ninjas.com/v1/exercises?muscle=";
    private static final String apiKey = "uGKCh/IdzUfkPpkFIbZsbw==WbuU3OLaXETp2yZG";
//    private static final String apiHost = "exercises-by-api-ninjas.p.rapidapi.com";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    public List<Exercise> allExcercises(String name) {
        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("X-Api-Key", apiKey);
//            headers.set("X-RapidAPI-Key", apiHost);

            //Get call to the API

            ResponseEntity<List<Exercise>> response = restTemplate.exchange(url + name, HttpMethod.GET, new HttpEntity<>(headers), new ParameterizedTypeReference<List<Exercise>>() {
            });

            log.info("response from api: {}", response.getBody());

            return response.getBody();
            //Exception thrown if content at source is not available
        } catch (Exception e) {
            log.error("Something went wrong", e);
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Exception while calling endpoint",
                    e
            );

        }

    }
}
