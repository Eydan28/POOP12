/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package practica_12_poo;

/**
 * Clase que implementa la interfaz {@code Runnable} para ejecutar un hilo que imprime
 * un mensaje en cada iteración y un mensaje final al terminar.
 * <p>
 * La clase {@code P12_HiloR} contiene un bucle que se ejecuta 10 veces, y en cada iteración
 * imprime el número de iteración junto con el nombre del hilo que lo ejecuta. Al finalizar
 * el bucle, imprime un mensaje indicando que el hilo ha terminado.
 * </p>
 * 
 * @author lenovo
 */
public class P12_HiloR implements Runnable {

    /**
     * Método sobrescrito de la interfaz {@code Runnable} que contiene la lógica que
     * se ejecutará en el hilo. Imprime el número de iteración junto con el nombre del
     * hilo actual en cada paso del bucle, y al final imprime un mensaje indicando la 
     * finalización del hilo.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion " + i + " " + Thread.currentThread().getName());
        }
        System.out.println("Termina el hilo " + Thread.currentThread().getName());
    }
}