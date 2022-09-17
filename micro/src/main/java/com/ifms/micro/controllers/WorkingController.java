package com.ifms.micro.controllers;

import com.ifms.micro.service.WorkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/worker")
public class WorkingController {
    
    @Autowired
    WorkerService serviceWorker;

    @GetMapping
    public  ResponseEntity<String> getWorker(){
        
        return ResponseEntity.ok(serviceWorker.getGreetingsSaudacao());
    
     
    }

  
      
     

}
