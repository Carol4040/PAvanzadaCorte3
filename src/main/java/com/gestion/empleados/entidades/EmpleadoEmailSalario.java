package com.gestion.empleados.entidades;

public class EmpleadoEmailSalario {

    private String email;
    private Double salario;

    public EmpleadoEmailSalario(String email, Double salario) {
        this.email = email;
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
