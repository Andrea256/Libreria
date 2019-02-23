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
 * 
 */
public class Libros {
    
    private String nombreLibro;
    
    private String nombreAutor;
    
    private String version;
    
    private String editorial;
    
    private boolean precioUni;


    /**
     * 
     * @param nombreLibro indica el nombre del libro.
     * @param nombreAutor indica el nombre del autor del libro.
     * @param version indica la version del libro.
     * @param editorial indica la editorial del libro.
     * @param precioUni indica el precio unitario del libro.
     */


       public Libros(String nombreLibro, String nombreAutor, String version, String editorial, boolean precioUni) {
        this.nombreLibro = nombreLibro;
        this.nombreAutor = nombreAutor;
        this.version = version;
        this.editorial = editorial;
        this.precioUni = precioUni; 
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
     * @param nombreAutor 
     */

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    /**
     * 
     * @param version 
     */

    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * 
     * @param editorial 
     */

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    /**
     * 
     * @param precioUni 
     */

    public void setPrecioUni(boolean precioUni) {
        this.precioUni = precioUni;
    }

}




