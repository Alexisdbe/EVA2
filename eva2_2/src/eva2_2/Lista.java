package eva2_2;

public class Lista {

    private Nodo inicio;

    public Lista() {
        inicio = null;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo temp = inicio;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }
}