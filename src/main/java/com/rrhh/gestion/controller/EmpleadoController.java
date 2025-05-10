package com.rrhh.gestion.controller;

import com.rrhh.gestion.dto.EmpleadoDTO;
import com.rrhh.gestion.entity.Empleado;
import com.rrhh.gestion.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping ("/api/empleados/")
@RestController


public class EmpleadoController {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    //Comienza el "mapeo"
    @GetMapping
    public List<Empleado> leerEmpleado() {
        return empleadoRepository.findAll();
    }

    @GetMapping("/comuna/")
    public List<EmpleadoDTO> leerEmpleadoDTO(){
        List<Empleado> empleados = empleadoRepository.findAll();
        List<EmpleadoDTO> empleadoDTO = new ArrayList<>();
        for (Empleado emp : empleados){
            empleadoDTO.add(new EmpleadoDTO(emp.getRut(),
                                            emp.getNombre(),
                                            emp.getTelefono(),
                                            emp.getCorreo(),
                                            emp.getComuna().getNombre()));
        }
        return  empleadoDTO;
    }

}