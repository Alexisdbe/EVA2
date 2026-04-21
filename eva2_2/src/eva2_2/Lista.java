public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }

    // Agregar un nodo al final de la lista
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);

        // Si la lista está vacía
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            // Conectar el último nodo actual al nuevo nodo
            fin.setSiguiente(nuevo);
            // El nuevo nodo ahora es el fin
            fin = nuevo;
        }
    }

    // Imprimir todos los elementos
    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
}