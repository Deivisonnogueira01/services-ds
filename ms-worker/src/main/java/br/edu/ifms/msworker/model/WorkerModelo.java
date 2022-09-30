package br.edu.ifms.msworker.model;



public class WorkerModelo {

    private Integer id = 1;

    private String nome = "Hariel";

    private Double salario = 3000D;

    public WorkerModelo(){
        
    }

    public WorkerModelo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    


}