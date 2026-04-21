/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_2_lista;

/**
 *
 * @author burci
 */
public class nodo {
    private int valor;
    private nodo siguiente;

    public nodo() {
        this.siguiente = null;
    }

    public nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    

 

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
    
   