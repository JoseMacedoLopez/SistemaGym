/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author JOSE
 */
public class Cliente {
    private Integer id_gym;
    private Integer dni;
    private String nombre;
    private String apellido;
    private String sexo;
    private LocalDate fechanaci;
    private Integer edad;
    private String direccion;
    private Integer telefono;
    private String gmail;
    private Double estatura;
    private Double peso;
    private Date fechaingreso;

    public Cliente(Integer id_gym, Integer dni, String nombre, String apellido, String sexo, LocalDate fechanaci, Integer edad, String direccion, Integer telefono, String gmail, Double estatura, Double peso, Date fechaingreso) {
        this.id_gym = id_gym;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechanaci = fechanaci;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.gmail = gmail;
        this.estatura = estatura;
        this.peso = peso;
        this.fechaingreso = fechaingreso;
    }

    public Integer getId_gym() {
        return id_gym;
    }

    public void setId_gym(Integer id_gym) {
        this.id_gym = id_gym;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(LocalDate fechanaci) {
        this.fechanaci = fechanaci;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
    
}
