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
public class MiHelper {
    public MiHelper(){
        
    }
    public void validarPassword(String pass, String repass) throws CustomException{
       if(!pass.equals(repass) ){
           throw new CustomException("Los campos de los password no coinciden");
       } 
       if(pass.length() < 8){
           throw new CustomException("El password no puede ser menor a 8 carecteres...");
       }
    }
}
