/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Carlos
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    
    
    
   public Usuario(String nom,String apell,String nif){
   nombre = nom;    
   apellido = apell;
   dni = nif;       
   }
   
   public String dar_nombre(){
   return nombre;    
   }
   public String dar_apellido(){
   return apellido;    
   } 
   public String dar_dni(){
   return dni;    
   }
    
    
}


