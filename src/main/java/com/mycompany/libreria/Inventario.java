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


public class Inventario {
    
    private String inventarioLibro;
    
    private int cantidadInventario;

    /**
     * 
     * @param inventarioLibro se almacenan los libros existentes.
     * @param cantidadInventario se almacenan la cantidad de los libros existentes.
     */
    
    public Inventario(String inventarioLibro, int cantidadInventario) {
        this.inventarioLibro = inventarioLibro;
        this.cantidadInventario = cantidadInventario;
    }
   
    /**
     * Método agrega un libro.
     */
    
    public void insertarLibro (){
    }
    
    /**
     * Método que modifica libros existentes.
     */
    
    public void modificarLibro(){        
    }
    
    /**
     * Método que elimina libros existentes.
     */
    
    public void eliminarLibro(){
    }
    
    /**
     * Método que consulta libro(os) que existen en el inventario.
     */
    
    public void consultarLibroInventario(){
    }
    
    /**
     * Método que consulta el invetario general.
     */
    public void consultarInventario(){
    }

    /**
     * 
     * @return inventarioLibro
     */
    
    public String getInventarioLibro() {
        return inventarioLibro;
    }
    
    /**
     * 
     * @return cantidadInventario
     */

    public int getCantidadInventario() {
        return cantidadInventario;
    }
    
    /**
     * 
     * @param inventarioLibro 
     */
    
    public void setInventarioLibro(String inventarioLibro) {
        this.inventarioLibro = inventarioLibro;
    }
    
    /**
     * 
     * @param cantidadInventario
     */
    
    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }
 

}
