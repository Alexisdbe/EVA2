package eva_2_2_lista;

public class lista {

    private nodo inicio;
    private nodo fin;

    public lista() {
        inicio = null;
        fin = null;
    }

    // =========================
    // AGREGAR AL FINAL
    // =========================
    public void agregar(int valor) {
        nodo nuevo = new nodo(valor);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    // =========================
    // AGREGAR EN POSICION
    // =========================
    public void agregarEn(int pos, int valor) {
        int tama = longitud();
        if (pos < 0 || pos > tama) {
            throw new RuntimeException("La posición no existe en la lista");
        }

        nodo nuevo = new nodo(valor);

        if (pos == 0) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            if (fin == null) {
                fin = nuevo;
            }
            return;
        }

        nodo temp = inicio;
        int cont = 0;
        while (cont < pos - 1) {
            temp = temp.getSiguiente();
            cont++;
        }

        nuevo.setSiguiente(temp.getSiguiente());
        temp.setSiguiente(nuevo);

        if (nuevo.getSiguiente() == null) {
            fin = nuevo;
        }
    }

    // =========================
    // BORRAR EN POSICION
    // =========================
    public void borrarEn(int pos) {
        int tama = longitud();
        if (pos < 0 || pos >= tama) {
            throw new RuntimeException("La posición no existe en la lista");
        }

        if (pos == 0) {
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                fin = null;
            }
            return;
        }

        nodo temp = inicio;
        int cont = 0;
        while (cont < pos - 1) {
            temp = temp.getSiguiente();
            cont++;
        }

        temp.setSiguiente(temp.getSiguiente().getSiguiente());

        if (temp.getSiguiente() == null) {
            fin = temp;
        }
    }

    // =========================
    // ES VACIA
    // =========================
    public boolean esVacia() {
        return inicio == null;
    }

    // =========================
    // ENCONTRAR EN POSICION
    // =========================
    public int encontrarEn(int pos) {
        int tama = longitud();
        if (pos < 0 || pos >= tama) {
            throw new RuntimeException("La posición no existe en la lista");
        }

        nodo temp = inicio;
        int cont = 0;
        while (cont < pos) {
            temp = temp.getSiguiente();
            cont++;
        }
        return temp.getValor();
    }

    // =========================
    // IMPRIMIR NORMAL
    // =========================
    public void imprimirlista() {
        nodo temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "] -> ");
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }

    // =========================
    // IMPRIMIR INVERSO
    // =========================
    public void imprimirlistainv() {
        for (int i = longitud() - 1; i >= 0; i--) {
            System.out.print("[" + encontrarEn(i) + "] -> ");
        }
        System.out.println("null");
    }

    // =========================
    // VACIAR LISTA
    // =========================
    public void vaciarLista() {
        inicio = null;
        fin = null;
    }

    // =========================
    // LONGITUD
    // =========================
    public int longitud() {
        int cant = 0;
        nodo temp = inicio;
        while (temp != null) {
            cant++;
            temp = temp.getSiguiente();
        }
        return cant;
    }
}