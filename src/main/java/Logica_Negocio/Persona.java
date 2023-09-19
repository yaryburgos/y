/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Alexis
 */

//Declarando atributos
public class Persona {
    public String Nombre;
    public int Año_de_Nacimiento;
    public int Cedula;
public String sexo;
    //constructor no parametrizado
    public Persona() {
    }
    
    //construtor parametrizado

    public Persona(String Nombre,  int Año_de_Nacimiento, int Cedula, String sexo ) {
        this.Nombre = Nombre;
       this.sexo= sexo;
        this.Año_de_Nacimiento = Año_de_Nacimiento;
        this.Cedula = Cedula;
    }
    
    //setters

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
        
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    public void setAño_de_Nacimiento(int Año_de_Nacimiento) {
        this.Año_de_Nacimiento = Año_de_Nacimiento;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    
    //getters

    public String getNombre() {
        return Nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getAño_de_Nacimiento() {
        return Año_de_Nacimiento;
    }

    public int getCedula() {
        return Cedula;
    }
    
}
