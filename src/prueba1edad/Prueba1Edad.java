/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1edad;

import java.util.*;

/**
 *
 * @author Piter
 */
public class Prueba1Edad {
    
       //Atributos
       private String nombre;
       private int edad;
 
       //Metodos
       public void cargarDatos(){
             Scanner entrada=new Scanner(System.in);
            
             System.out.println("Digite el nombre... ");
             nombre=entrada.next();
            
             System.out.println("Digite la edad... ");
             edad= entrada.nextInt();
       }
      
       public void mostrarDatos(){
            
             System.out.println("El nombre es "+nombre);
             System.out.println("La edad es " +edad);
       }
 
       public void esMayorEdad(){
            
             if (edad >= 18 ){
                    System.out.println(nombre+" es mayor de edad.");
             }
            
             else {
                    System.out.println(nombre+" no es mayor de edad.");
             }
       }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Prueba1Edad persona = new Prueba1Edad();
            
       persona.cargarDatos();
       persona.mostrarDatos();
       persona.esMayorEdad();
       }
    }
   
