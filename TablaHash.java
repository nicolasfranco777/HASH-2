import java.util.LinkedList;

class TablaHash {
    private LinkedList<Integer>[] tabla;
    private int size;

    @SuppressWarnings("unchecked")
    public TablaHash(int size) {
        this.size = size;
        tabla = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            tabla[i] = new LinkedList<>();
        }
    }

   
    private int hash(int clave) {
        return clave % size;
    }

    
    public void insertar(int clave) {
        int indice = hash(clave);
        tabla[indice].add(clave);
    }

    
    public void mostrar() {
        System.out.println("Contenido de la tabla hash:");
        for (int i = 0; i < size; i++) {
            System.out.print("Índice " + i + ": ");
            for (int clave : tabla[i]) {
                System.out.print(clave + " -> ");
            }
            System.out.println("null");
        }
    }
}

public class HashEncadenamiento {
    public static void main(String[] args) {
        TablaHash tabla = new TablaHash(10);

        
        tabla.insertar(12);
        tabla.insertar(22);
        tabla.insertar(42);

        
        tabla.mostrar();
    }
}
