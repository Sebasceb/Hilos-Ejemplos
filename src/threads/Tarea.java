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

public class Tarea extends Thread{

    @Override
    public void run() {
        for (int i=1;i<=50;i++) {
            System.out.println(getName() + " : " +i);
        }
    }
    
}