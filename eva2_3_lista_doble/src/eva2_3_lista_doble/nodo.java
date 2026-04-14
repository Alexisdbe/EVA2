/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author burci
 */
public class nodo {
    private int valor;
    private nodo siguiente;
    private nodo previo;

    public nodo() {
        this.siguiente = null;
        this.previo = null;
    }

    public nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
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

    public nodo getPrevio() {
        return previo;
    }

    public void setPrevio(nodo previo) {
        this.previo = previo;
    }
    
    
    
}
    
   