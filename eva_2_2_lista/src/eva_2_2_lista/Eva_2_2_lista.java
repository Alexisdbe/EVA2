package eva_2_2_lista;

public class Eva_2_2_lista {

    public static void main(String[] args) {

        lista Lista = new lista();
    
       

        Lista.agregar(100);
        Lista.agregar(200);
        Lista.agregar(300);
        Lista.agregar(400);
        Lista.agregar(500);

        Lista.imprimirlista();

        System.out.println("Cantidad de nodos: " + Lista.longitud());

        Lista.agregarEn(3, -1);

        Lista.imprimirlista();
        System.out.println("Cantidad de nodos:" + lista.longitud());
        System.out.println("Posicion 5" + lista.encontrarEn(5));
        System.out.println("Posicion 4" + lista.encontrarEn(4));
        System.out.println("Posicion 3" + lista.encontrarEn(3));
        System.out.println("Posicion 2" + lista.encontrarEn(2));
        System.out.println("Posicion 1" + lista.encontrarEn(1));
        
       Lista.imprimirlista();
          System.out.println("Borrar posicion 3 " + lista.encontrarEn(3));
          lista.borrarEn(3);
          
       
        
       
    }
}