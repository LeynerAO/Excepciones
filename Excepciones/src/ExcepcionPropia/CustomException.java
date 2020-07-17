/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcepcionPropia;

/**
 *
 * @author Leyner Alvarez
 */
public class CustomException extends Exception {
   //programar el codigo fuente que se debe ejecutar cuando el catch se a ctiva
    //este codigo fuente son operaciones propias, una resolucion del problema que se presenta

    public static final long serialVersionUID = 700L;
    
    public CustomException(String mensaje){
        super(mensaje);
    }
    
}
