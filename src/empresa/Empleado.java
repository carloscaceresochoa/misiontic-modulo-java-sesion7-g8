/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author DELL
 */
public class Empleado {

    protected String codigo;
    protected String nombres;
    protected String apellidos;
    protected double sueldo;
    protected String cargo;

    public Empleado(String codigo, String nombres, String apellidos,
            double sueldo, String cargo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }
    
    public void mostrarEmpleado(){
        System.out.println("Codigo "+codigo);
        System.out.println("Nombres "+nombres);
        System.out.println("Apellidos "+apellidos);
        System.out.println("Sueldo "+sueldo);
        System.out.println("Cargo "+cargo);
    }   
    
    

}
