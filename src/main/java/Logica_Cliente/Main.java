/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    //Declarando variables
    public static void main(String[] args) {
        String Nombre="";
        int Año_de_Nacimiento=0;
        int Cedula=0;
        
        int Año_Actual=2023;
        int Resultado=0;
        
        
        //creacion de objetos
        
        Persona objpersona = new Persona ();
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Digite en nombre de la persona");
        Nombre = scan.nextLine();
        objpersona.setNombre(Nombre);
        
        System.out.println("Digite el año en que nacio la persona");
        Año_de_Nacimiento = scan.nextInt();
        objpersona.setAño_de_Nacimiento(Año_de_Nacimiento);
        
        System.out.println("Dijite el numero de cedula de la persona");
        Cedula = scan.nextInt();
        objpersona.setCedula(Cedula);
        
     
        //operacion
        Resultado = Año_Actual - objpersona.getAño_de_Nacimiento();
        
        
    
        
        // impresion por pantalla
        System.out.println("El nombre de la persona es:"+"\t"+ objpersona.getNombre());
        System.out.println("El año en el que nacio la persona es:"+"\t"+ objpersona.getAño_de_Nacimiento());
        System.out.println("El numero de cedula de la persona es:"+"\t"+ objpersona.getCedula());
        System.out.println("La edad que tiene actualmente la persona es:"+"\t"+ Resultado);
   }
    
}
