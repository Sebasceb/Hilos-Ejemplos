/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Gladys
 */
public class EjemploHilos {
    public static void main(String[] args) {
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
       // tarea1.run();
       // tarea2.run();
        tarea1.start();
        tarea2.start();



        

    }
    
}
