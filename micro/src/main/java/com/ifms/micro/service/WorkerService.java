package com.ifms.micro.service;

import com.ifms.micro.model.Gretting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WorkerService {
    

 @Autowired   
 private RestTemplate restTemplate;
    
 
 public String getGreetingsSaudacao(){
    
    Gretting greeting = restTemplate.getForObject("localhost:8080/greeting", Gretting.class);

    return greeting.getSaudacao();
 }
     
     
 
}
