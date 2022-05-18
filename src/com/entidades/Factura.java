/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

/**
 *
 * @author JOSE
 */
public class Factura {
    private Integer id_gym;
    private String n_factura;
    private String empleado;
    private Integer cantidad;

    public Factura(Integer id_gym, String n_factura, String empleado, Integer cantidad) {
        this.id_gym = id_gym;
        this.n_factura = n_factura;
        this.empleado = empleado;
        this.cantidad = cantidad;
    }

    public Integer getId_gym() {
        return id_gym;
    }

    public void setId_gym(Integer id_gym) {
        this.id_gym = id_gym;
    }

    public String getN_factura() {
        return n_factura;
    }

    public void setN_factura(String n_factura) {
        this.n_factura = n_factura;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
