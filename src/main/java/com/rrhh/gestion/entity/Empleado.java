package com.rrhh.gestion.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    private String rut;
    private String nombre;
    private String telefono;
    private String correo;

    @ManyToOne
    @JoinColumn(name="id_comuna", nullable = false)
    private Comuna comuna;
    @JsonIgnoreProperties("comuna")

    public Empleado() {
    }

    public Empleado(String rut, String nombre, String telefono, String correo) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }
}
