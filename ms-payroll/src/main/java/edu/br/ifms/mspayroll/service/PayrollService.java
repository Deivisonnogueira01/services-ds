package edu.br.ifms.mspayroll.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PayrollService {



   final private RestTemplate restTemplate;

   @Value("${ms-worker.url}")
   private String workerUrl;

   public PayrollService(RestTemplate restTemplate) {
      this.restTemplate = restTemplate;
   }

   public Double getWorker(Integer days, Integer id) {

      Map<String, String> params = new HashMap<>();

      params.put("id", String.valueOf(id));

      Double salary = restTemplate.getForObject(workerUrl + "/{id}/salary", Double.class, params);
      salary = days * (salary * 0.03);
      return salary;
   } 
}
