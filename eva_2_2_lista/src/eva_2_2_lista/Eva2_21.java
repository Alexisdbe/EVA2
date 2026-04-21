package eva_2_2_lista;

public class Eva2_21 {

    public static void main(String[] args) {

        long ini, fin, tiempo;

        lista Lista = new lista();
        int[] arreglo = new int[1000000];

        // MEDIR ARREGLO
        ini = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arreglo[i] = (int) (Math.random() * 1000);
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("arreglo: " + tiempo);

        // MEDIR LISTA
        ini = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Lista.agregar((int) (Math.random() * 1000));
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("lista: " + tiempo);

        // PRUEBAS
        Lista.imprimirlista();
        Lista.imprimirlistainv();

        Lista.agregarEn(0, 999);
        Lista.agregarEn(3, 777);
        Lista.imprimirlista();

        Lista.borrarEn(2);
        Lista.imprimirlista();

        System.out.println("Elemento en posición 1: " + Lista.encontrarEn(1));
        System.out.println("¿Lista vacía? " + Lista.esVacia());

        Lista.vaciarLista();
        System.out.println("¿Lista vacía? " + Lista.esVacia());
    }
}