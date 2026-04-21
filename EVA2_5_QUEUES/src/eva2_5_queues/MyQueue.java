/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_queues;

/**
 *
 * @author burci
 */
public class MyQueue {
    private Nodo inicio;
    private Nodo fin;

    public MyQueue() {
        this.inicio = null;
        this.fin = null;
    }

    // ENQUEUE: Agregar al final de la fila
    public void enqueue(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) { // Si la cola está vacía
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo); // El actual fin apunta al nuevo
            fin = nuevo;             // El nuevo es ahora el fin
        }
    }

    // DEQUEUE: Quitar y retornar el primer elemento
    public Integer dequeue() {
        if (isEmpty()) return null;

        int valor = inicio.getValor();
        inicio = inicio.getSiguiente(); // El inicio se mueve al siguiente
        
        // Si al quitar el elemento la cola queda vacía, fin también debe ser null
        if (inicio == null) {
            fin = null;
        }
        return valor;
    }

    // PEEK: Ver el primer elemento sin quitarlo
    public Integer peek() {
        return (isEmpty()) ? null : inicio.getValor();
    }

    public boolean isEmpty() {
        return inicio == null;
    }
}
