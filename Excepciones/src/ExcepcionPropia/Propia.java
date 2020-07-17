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
public class Propia {
    public static void main(String[] args){
        String user, pass, repass;
        
        user="Leyner";
        pass="12345678";
        repass="12345678aa";
        
        MiHelper h= new MiHelper();
        try {
            h.validarPassword(pass, repass);
        } catch (CustomException e) {
            System.out.println("No se puede registrar el usuario, Debido al siguiente problema" + e.getMessage());
        }
    }
    
}
