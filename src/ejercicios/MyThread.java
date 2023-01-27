/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Gladys
 */
public class MyThread  extends Thread 
{
    public static void main(String[] args) 
    {
        MyThread t = new MyThread(); /* Line 5 */
        t.run();  /* Line 6 */
    }

    public void run() 
    {
        for(int i=1; i < 3; ++i) 
        {
            System.out.print(i + "..");
        }
    }
}
