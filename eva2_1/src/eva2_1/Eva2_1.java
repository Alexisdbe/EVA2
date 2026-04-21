/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1;

/**
 *
 * @author burci
 */
public class Eva2_1 {
public static void main(String[] args) {
        // Se crea la primera instancia (referencia principal)
        Ejemplo miObj = new Ejemplo();
        miObj.valor = 100;

        // Se crea una segunda instancia vinculada a la primera
        miObj.otro = new Ejemplo();
        miObj.otro.valor = 200;

        // Se crea una tercera instancia vinculada a la segunda
        miObj.otro.otro = new Ejemplo();
        miObj.otro.otro.valor = 300;

        // Impresión de los valores para verificar la cadena de referencias
        System.out.println("MiObj = " + miObj.valor);
        System.out.println("MiObj.otro = " + miObj.otro.valor);
        System.out.println("MiObj.otro.otro = " + miObj.otro.otro.valor);
    }
}

class Ejemplo {
    int valor;
    Ejemplo otro; // Autorreferencia: permite que un objeto apunte a otro del mismo tipo
}
    

