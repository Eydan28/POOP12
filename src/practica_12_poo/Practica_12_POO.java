/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_12_poo;

/**
 * Clase principal de la práctica 12 en Programación Orientada a Objetos.
 * <p>
 * La clase {@code Practica_12_POO} contiene el método {@code main()} que 
 * ejecuta varios hilos utilizando las clases {@code Hilo} y {@code P12_HiloR}. 
 * Este ejemplo ilustra cómo crear y ejecutar hilos tanto con clases que extienden 
 * {@code Thread} como con clases que implementan la interfaz {@code Runnable}.
 * </p>
 * 
 * <p>
 * La ejecución de los hilos es administrada por el planificador de tareas (scheduler),
 * que asigna el tiempo de CPU a cada hilo, ejecutándolos en un orden que puede 
 * depender de varios factores, como la cantidad de procesos en el sistema.
 * </p>
 * 
 * @author lenovo
 */
public class Practica_12_POO {

    /**
     * Método principal de la clase {@code Practica_12_POO} que crea y ejecuta varios hilos.
     * <p>
     * Primero, se crean y se inician varios objetos de tipo {@code Hilo} mediante el 
     * método {@code start()} para ejecutar hilos nombrados. Después, se ejecutan tres 
     * instancias de {@code P12_HiloR} como hilos, cada uno con un nombre específico.
     * </p>
     * <p>
     * Ejemplos de creación de hilos:
     * </p>
     * <ul>
     *   <li>Instanciación de hilos {@code Hilo} asignados a variables.</li>
     *   <li>Ejecución directa de hilos con {@code P12_HiloR} usando el constructor 
     *       {@code Thread(Runnable, String)}.</li>
     * </ul>
     * 
     * @param args los argumentos de línea de comandos (no utilizados en este ejemplo)
     */
    public static void main(String[] args) {
        // Ejemplo de creación de hilos usando la clase Hilo
        /*
        Hilo h1 = new Hilo("Hilo1");
        Hilo h2 = new Hilo("Hilo2");
        Hilo h3 = new Hilo("Hilo3");

        // Inicio de los hilos
        h1.start();
        h2.start();
        h3.start();

        // Ejecución directa sin almacenar en variables
        new Hilo("Hilo4").start();
        new Hilo("Hilo5").start();
        */

        // Ejecución de hilos usando la clase P12_HiloR con Runnable
        new Thread(new P12_HiloR(), "HiloR1").start();
        new Thread(new P12_HiloR(), "HiloR2").start();
        new Thread(new P12_HiloR(), "HiloR3").start();
    }
    
}
