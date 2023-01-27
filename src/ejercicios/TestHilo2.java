/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Gladys
 */
public class TestHilo2 {
    public static void main(String[] args) {
        int[] numeros = {2,4,6};
        try{
           int valor = numeros[3];
            System.out.println(valor);
        }catch(Exception e){
            System.out.println("Se ha producido un error");
            new Thread(()->{
                System.out.println("intente nuevamente");
            });
        }
    }
}
