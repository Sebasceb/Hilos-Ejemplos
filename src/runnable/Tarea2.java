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

public class Tarea2 implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=50;i++) {
            System.out.println(i);
        }
    }
    
}