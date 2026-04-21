/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_4_stack;

/**
 *
 * @author burci
 */
public class Eva_2_4_stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack pila = new MyStack();
        
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        
        System.out.println("Cima de la pila: " + pila.peek()); // Debería ser 40
        
        System.out.println("Extrayendo: " + pila.pop()); // Quita el 40
        System.out.println("Nueva cima: " + pila.peek()); // Ahora es 30
        
        // Ejemplo de vaciado
        System.out.println("Vaciando pila:");
        while(!pila.isEmpty()){
            System.out.print(pila.pop() + " - ");
        }
    }
}
