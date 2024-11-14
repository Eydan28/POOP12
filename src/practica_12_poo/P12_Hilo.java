/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_12_poo;

/**
 * Clase que extiende la clase {@code Thread} para crear un hilo que imprime
 * un mensaje en cada iteración de un bucle y un mensaje final cuando termina.
 * <p>
 * La clase {@code P12_Hilo} permite asignar un nombre al hilo mediante el constructor,
 * y luego en el método {@code run()} ejecuta un bucle de 10 iteraciones, imprimiendo
 * el número de iteración y el nombre del hilo en cada paso.
 * </p>
 * 
 * @author lenovo
 */
public class P12_Hilo extends Thread {

    /**
     * Constructor que crea un nuevo hilo y le asigna el nombre especificado.
     *
     * @param name el nombre que se asignará al hilo
     */
    public P12_Hilo(String name) {
        super(name);
    }

    /**
     * Método sobrescrito de la clase {@code Thread} que contiene la lógica
     * a ejecutarse en el hilo. En cada iteración del bucle, imprime el número de iteración
     * y el nombre del hilo. Al finalizar el bucle, imprime un mensaje indicando
     * la terminación del hilo.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i + " hilo " + getName());
        }
        
        System.out.println("Termina " + getName());
    }
}
