import java.util.ArrayList;

/**
 * Programa educativo sobre ArrayList en Java
 * Este programa demuestra las operaciones básicas con listas (ArrayList)
 * 
 * @author Harold Lopez
 */
public class Main {
    
    /**
     * Método principal que ejecuta ejemplos de ArrayList
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        // Mostrar ayuda al usuario
        mostrarAyuda();
        
        // Crear una nueva lista de números enteros
        ArrayList<Integer> nums = new ArrayList<>();
        
        // Agregar elementos a la lista
        System.out.println("\n=== AGREGANDO ELEMENTOS ===");
        nums.add(12);
        System.out.println("Agregado: 12");
        nums.add(15);
        System.out.println("Agregado: 15");
        nums.add(35);
        System.out.println("Agregado: 35");
        nums.add(48);
        System.out.println("Agregado: 48");
        
        // Mostrar la lista completa
        System.out.println("\nLista completa: " + nums);
        
        // Acceder a elementos por posición (índice)
        System.out.println("\n=== ACCEDIENDO A ELEMENTOS ===");
        System.out.println("Elemento en la posición 0: " + nums.get(0));
        System.out.println("Elemento en la posición 3: " + nums.get(3));
        
        // Mostrar información sobre la lista
        System.out.println("\n=== INFORMACIÓN DE LA LISTA ===");
        System.out.println("El tamaño de la lista es: " + nums.size());
        System.out.println("¿La lista está vacía? " + nums.isEmpty());
        
        // Demostrar operaciones adicionales
        demostrarOperacionesAdicionales(nums);
    }
    
    /**
     * Muestra ayuda e información sobre el programa
     */
    public static void mostrarAyuda() {
        System.out.println("=== AYUDA - PROGRAMA DE LISTAS ===");
        System.out.println("Este programa demuestra el uso de ArrayList en Java.");
        System.out.println();
        System.out.println("ArrayList es una estructura de datos que permite:");
        System.out.println("• Almacenar elementos de forma ordenada");
        System.out.println("• Agregar elementos con add()");
        System.out.println("• Acceder a elementos por índice con get()");
        System.out.println("• Conocer el tamaño con size()");
        System.out.println("• Modificar, buscar y eliminar elementos");
        System.out.println();
        System.out.println("Los índices comienzan en 0 (primer elemento = índice 0)");
        System.out.println("==========================================");
    }
    
    /**
     * Demuestra operaciones adicionales con ArrayList
     * @param lista la lista sobre la cual realizar las operaciones
     */
    public static void demostrarOperacionesAdicionales(ArrayList<Integer> lista) {
        System.out.println("\n=== OPERACIONES ADICIONALES ===");
        
        // Buscar un elemento
        boolean contiene35 = lista.contains(35);
        System.out.println("¿La lista contiene el número 35? " + contiene35);
        
        // Encontrar la posición de un elemento
        int posicion15 = lista.indexOf(15);
        System.out.println("El número 15 está en la posición: " + posicion15);
        
        // Modificar un elemento
        System.out.println("\nModificando el elemento en posición 1...");
        int valorAnterior = lista.set(1, 20);
        System.out.println("Valor anterior: " + valorAnterior + ", nuevo valor: " + lista.get(1));
        System.out.println("Lista después de la modificación: " + lista);
        
        // Agregar un elemento en una posición específica
        lista.add(2, 25);
        System.out.println("\nDespués de insertar 25 en posición 2: " + lista);
        
        // Mostrar el estado final
        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Lista final: " + lista);
        System.out.println("Tamaño final: " + lista.size());
    }
}   