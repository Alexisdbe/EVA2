package eva2_2;

public class Eva2_2 {

    public static void main(String[] args) {
        long ini, fin, tiempo;
        
        Lista lista = new Lista();
        int[] arreglo = new int[1000000];

        // medir arreglo
        ini = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            arreglo[i] = (int)(Math.random() * 1000);
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("arreglo " + tiempo);

        // medir lista
        ini = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            lista.agregar((int)(Math.random() * 100000));
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("lista " + tiempo);
    }
}