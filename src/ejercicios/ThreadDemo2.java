/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Gladys
 */

class MyThread extends Thread 
{ 
    MyThread() {} 
    MyThread(Runnable r) {super(r); } 
    @Override
    public void run() 
    { 
        System.out.print("Inside Thread ");
    } 
} 
class RunnableDemo implements Runnable 
{ 
    @Override
    public void run() 
    { 
        System.out.print(" Inside Runnable"); 
    } 
} 
public class ThreadDemo2
{  
    public static void main(String[] args) 
    { 
        new MyThread().start(); 
        new MyThread(new RunnableDemo()).start(); 
    } 
}
