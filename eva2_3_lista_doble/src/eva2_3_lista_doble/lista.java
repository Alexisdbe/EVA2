package eva2_3_lista_doble;

public class lista {

    private nodo inicio; 
    private nodo fin;
    private int cont;
    
    
    public lista() {
        this.inicio = null;
        this.fin = null;
        this.cont = 0;
    }

    
    public void imprimirlista() {
        nodo temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "] -> ");
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }

    
    public void imprimirlistainv() {
        nodo temp = fin;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "] -> ");
            temp = temp.getPrevio();
        }
        System.out.println("null");
    }

    
    public int longitud() {
        return this.cont;
    }

    
    public void vaciarLista() {
        inicio = null;
        fin = null;
        cont = 0;
    }

   
    public boolean esVacia() {
        return inicio == null;
    }

    
    public void agregar(int valor) {
        nodo nuevo = new nodo(valor);
        if (inicio == null) {
            inicio = nuevo; 
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        cont++;
    }
}