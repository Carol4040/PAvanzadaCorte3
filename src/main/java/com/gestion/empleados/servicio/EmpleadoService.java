package com.gestion.empleados.servicio;

import java.util.List;

import com.gestion.empleados.entidades.EmpleadoEmailSalario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestion.empleados.entidades.Empleado;

public interface EmpleadoService {

	List<Empleado> findAll();

	Page<Empleado> findAll(Pageable pageable);

	void save(Empleado empleado);

	Empleado findOne(Long id);

	void delete(Long id);

	List<EmpleadoEmailSalario> findAllEmailsAndSalaries();

}
