package com.rest.clientrest.service;

import com.rest.clientrest.model.Greetting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class ClienteRestService {
  
    @Autowired   
    private RestTemplate restTemplate;
       
    
    public String getGreetingDescription(){
       
        Greetting  greeting = restTemplate.getForObject("localhost:8080/greeting", Greetting.class);
   
       return greeting.getSaudacao();
    }
}
