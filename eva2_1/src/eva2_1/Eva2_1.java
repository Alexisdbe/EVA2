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
        // Crear el primer objeto
        Ejemplo miObj = new Ejemplo();
        miObj.valor = 100;

        // Crear el segundo objeto anidado
        miObj.otro = new Ejemplo();
        miObj.otro.valor = 200;

        // Crear el tercer objeto anidado
        miObj.otro.otro = new Ejemplo();
        miObj.otro.otro.valor = 300;

        // Impresión de resultados
        System.out.println("MiObj = " + miObj.valor);
        System.out.println("MiObj.otro = " + miObj.otro.valor);
        System.out.println("MiObj.otro.otro = " + miObj.otro.otro.valor);
    }
}

class Ejemplo {
    int valor;
    Ejemplo otro;
}
    

