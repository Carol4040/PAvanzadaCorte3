package com.gestion.empleados.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gestion.empleados.entidades.Empleado;

import java.util.List;

public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado, Long>{
    @Query("SELECT e.email FROM Empleado e")
    List<String> findAllEmails();
}
