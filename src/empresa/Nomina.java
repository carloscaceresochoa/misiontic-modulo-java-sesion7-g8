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
public class Nomina extends Empleado{
    private int horasExtras;
    public Nomina(String codigo, String nombres, String apellidos, 
            double sueldo, String cargo,int horasExtras) {
        super(codigo, nombres, apellidos, sueldo, cargo);
        this.horasExtras=horasExtras;
    }
    
    public double aportesSeguridad(){
        return this.sueldo*0.08;
    }
    public double liquidarNomina(){
        final int VALOR_HORAS_EXTRAS=33000;
        return sueldo+(this.horasExtras+VALOR_HORAS_EXTRAS)-aportesSeguridad();
    }
    public void mostrarEmpleadoNomina(){
        super.mostrarEmpleado();
        System.out.println("Total a Pagar "+liquidarNomina());
    }
    
}
