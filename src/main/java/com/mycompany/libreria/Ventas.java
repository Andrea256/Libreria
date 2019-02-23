/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libreria;

/**
 *
 * @author AndreaOrjuela
 *  
 */

public class Ventas {
    
    private String nombre;
    private String cedula;
    private String nombreLibro;
    private int cantidad;

    /**
     * 
     * @param nombre se guarda el numero del cliente.
     * @param cedula se guarda la cedula del cliente.
     * @param nombreLibro se guarda el nombre del libro a comprar.
     * @param cantidad se guarda la cantidad a comprar.
     */

    public Ventas(String nombre, String cedula, String nombreLibro, int cantidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nombreLibro = nombreLibro;
        this.cantidad = cantidad;
    }
    
    /**
     * Método donde se hace la venta.
     */
    
    public void nuevaVenta(){
    }
    
    /**
     * Método en el que se consulta una venta realizada en caso de ser necesario.
     */
    
    public void consultarVenta(){
    }
    
    /**
     * Método que genera la alerta de la cantidad mínima de libros.
     */
    
    public void alertaLibro(){    
    }
    
    /**
     * 
     * @return nombre
     */
    
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @return  cedula.
     */

    public String getCedula() {
        return cedula;
    }
    
    /**
     * 
     * @return nombreLibro
     */

    public String getNombreLibro() {
        return nombreLibro;
    }

    /**
     * 
     * @return cantidad
     */
    
    public int getCantidad() {
        return cantidad;
    }
    
    /**
     * 
     * @param nombre 
     */
 
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @param cedula 
     */

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    /**
     * 
     * @param nombreLibro 
     */

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    
    /**
     * 
     * @param cantidad 
     */

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
            
}
