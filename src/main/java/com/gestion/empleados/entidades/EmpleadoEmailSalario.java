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

    public Double getSalario() {
        return salario;
    }

}
