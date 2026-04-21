package eva2_2;

public class Eva2_2 {

   public static void main(String[] args) {
        Lista miLista = new Lista();
        
        miLista.agregar(10);
        miLista.agregar(20);
        miLista.agregar(30);
        miLista.agregar(40);
        
        System.out.println("Contenido de la lista:");
        miLista.imprimir();
    }
}