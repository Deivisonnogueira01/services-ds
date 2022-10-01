package edu.br.ifms.mspayroll.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.br.ifms.mspayroll.model.Payrol;
import edu.br.ifms.mspayroll.service.PayrollService;

@RestController
@RequestMapping("/payroll")
public class PayrollController {
    

     final private PayrollService service;


     public PayrollController(PayrollService service){
        this.service = service;
     }


     @GetMapping(value = "/days/{days}/workerId/{id}")
     public ResponseEntity<Double> getPayroll(@PathVariable Integer days, @PathVariable Integer id){

        return ResponseEntity.ok(service.getWorker(days, id));

     }

}
