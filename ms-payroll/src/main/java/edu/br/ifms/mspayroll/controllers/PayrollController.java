package edu.br.ifms.mspayroll.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.br.ifms.mspayroll.model.Payrol;

@RestController
@RequestMapping("/payroll")
public class PayrollController {
    


     @GetMapping(value = "/days/{days}/workerId/{id}")
     public ResponseEntity<Payrol> getPayroll(@PathVariable Integer id){

        Payrol payrol = new Payrol();
        return ResponseEntity.ok(payrol);
     }

}
