/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

/**
 *
 * @author Gladys
 */
class HiloSleep extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

public class EjemploSleep {

    public static void main(String[] args) {
        System.out.println("Salida antes de domir ");
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Salida despues de domir ");
        
        HiloSleep hilo = new HiloSleep();
        hilo.start();
        
                HiloSleep hilo2 = new HiloSleep();
        hilo2.start();
    }
}
