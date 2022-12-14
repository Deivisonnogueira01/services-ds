package br.edu.ifms.msworker.controllers;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.msworker.model.WorkerModelo;
import lombok.var;

@RestController
@RequestMapping("/api")
public class WorkerController {

    @GetMapping("/{id}")
     public ResponseEntity<WorkerModelo> getWorker (@PathVariable("id") Integer id){

        WorkerModelo worker = new WorkerModelo(id);
       return ResponseEntity.ok(worker);

     }

     @GetMapping("/{id}/salary")
     public ResponseEntity<Double> getSalaryWorker(@PathVariable Integer id){

       var worker = new WorkerModelo();
       return ResponseEntity.ok(worker.getSalario());
     }
    
}
