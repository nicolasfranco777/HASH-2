import java.util.*;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(nombre, edad);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

public class hashejemplo2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Ana", 30);
        Persona p3 = new Persona("Juan", 25); 

        
        Set<Persona> conjunto = new HashSet<>();
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3); 

        System.out.println("Conjunto de personas: " + conjunto);

        
        Map<Persona, String> mapa = new HashMap<>();
        mapa.put(p1, "Ingeniero");
        mapa.put(p2, "Doctora");
        mapa.put(p3, "Arquitecto"); 

        System.out.println("Mapa de personas:");
        for (Map.Entry<Persona, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

       
        System.out.println("\nHashCodes:");
        System.out.println("p1: " + p1.hashCode());
        System.out.println("p2: " + p2.hashCode());
        System.out.println("p3: " + p3.hashCode() + " (igual que p1)");
    }
}
