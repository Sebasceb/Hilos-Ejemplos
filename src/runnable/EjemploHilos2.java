/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnable;

/**
 *
 * @author Gladys
 */
public class EjemploHilos2 {
    public static void main(String[] args) {       
        System.out.println("Ejemplo con runnable");
        Tarea2 tarea1 = new Tarea2();//primero se crea el objeto
        
        Tarea2 tarea2 = new Tarea2();
        //Thread t1 = new Thread(tarea1);
        Thread t2 = new Thread(tarea2);
        Thread t1 = new Thread(new Tarea2(),"Hilo 1");
        
        
        
        t1.start();
        
        t2.start();
                
    }
}
