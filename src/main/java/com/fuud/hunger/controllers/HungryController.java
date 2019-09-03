package com.fuud.hunger.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
* The controller class for the Hunger application. 
* Returns a maximum of 50 businesses from the Yelp search API.
*
* @author  Brandon Heiss
* @version 1.0
* @since   2019-09-01 
*/
@RestController
public class HungryController {

    @RequestMapping(value = "/getfuud/{location}", method=RequestMethod.GET)
    public String getFuud(@PathVariable final String location) throws Exception {

        String api_key = "6Dfasg-YgN2otNmmvt-5HInoAwkjlrkNsrK4g7wEFlSeEBEOuJpgtnNEU9DTyw1WmxAoGjug1WJavg7zBOxByQeHRfmDHWGMMxd3npSBqyG5jD8UNHijSgFgdR9pXXYx";

        String url = "https://api.yelp.com/v3/businesses/search?categories=restaurants&limit=50&location=" + location;
        
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(api_key);

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return response.getBody();

    }
}