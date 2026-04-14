package eva2_3_lista_doble;

public class Eva2_3_lista_doble {

    public static void main(String[] args) {

        lista Lista = new lista();

        Lista.agregar(100);
        Lista.agregar(200);
        Lista.agregar(300);
        Lista.agregar(400);
        Lista.agregar(500);

        // PRUEBAS
        Lista.imprimirlista();
        Lista.imprimirlistainv();
        System.out.println(Lista.longitud());
    }
}