/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*objeto 1 perro*/
        Perro perro1=new Perro();
        perro1.setNombre("pepe");
        perro1.setRaza("pincher");
        perro1.setColor("negro");
        perro1.setEdad(3);
        perro1.setPeso(7);
        perro1.setEstatura(10);
        perro1.setComida("pepitas");
        perro1.setVive(true);
        perro1.setSexo('M');
        perro1.comer();
        perro1.dormir();
        System.out.println(perro1.estadoPerro());
        perro1.mostrar();
        System.out.println();
        System.out.println();
        /**objeto 2 perro*/
        Perro perro2=new Perro();
        perro2.setNombre("ela");
        perro2.setSexo('F');
        perro2.setColor("Negra");
        perro2.setEdad(1);
        perro2.setPeso(3);
        perro2.setEstatura(5);
        perro2.setComida("Frisby");
        perro2.setVive(true);
        perro2.setRaza("Pincher");
        perro2.mostrar();
        System.out.println("");
        /**
         * parametros del constructor
         * nombre,raza,color,edad,estatura,peso,comida,sexo,vive
         */
        Perro perro3=new Perro("firualis","Criollo","Blanco",2,
                               5,4,"Carne",'M',true);
        perro3.comer();
        perro3.dormir();
        System.out.println(perro3.estadoPerro());
        perro3.mostrar();
        
        
        
        
    }
    
}
