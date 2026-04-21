/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_queues;

/**
 *
 * @author burci
 */
public class EVA2_5_QUEUES {
    public static void main(String[] args) {
        MyQueue cola = new MyQueue();

        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println("Primer elemento en la fila: " + cola.peek()); // Debe ser 10

        System.out.println("Atendiendo a: " + cola.dequeue()); // Quita el 10
        System.out.println("Siguiente en la fila: " + cola.peek()); // Ahora es 20

        System.out.println("Resto de la fila:");
        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " - ");
        }
    }
}
