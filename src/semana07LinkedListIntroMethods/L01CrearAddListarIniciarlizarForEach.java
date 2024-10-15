package semana07LinkedListIntroMethods;

import java.util.Arrays;
import java.util.LinkedList;

public class L01CrearAddListarIniciarlizarForEach {
    
    public static void main(String[] args) {
        // 1. Crear una lista enlazada de tipo Integer llamada vistas
        LinkedList<Integer> vistas = new LinkedList<>();
        // 2. Insertar 3 elementos a la lista
        vistas.add(10);
        vistas.add(20);
        vistas.add(30);
        for(Integer numero : vistas) {
            System.out.print(numero+"  ");
        }
        System.out.println("");
        
        // 3.Crear una lista enlazada de tipo Float llamada precios inicializada con 3 valores
        LinkedList<Float> precios = new LinkedList<>(Arrays.asList(12.5f, 99.99f, 49.99f));
        
        // 4. Crear una lista enlazada de tipo Laptop llamada ofertas con 2 valores inicializados
        LinkedList<Laptop> ofertas = new LinkedList<>(Arrays.asList(new Laptop("HP", "Modelo 1", 5), new Laptop("LG", "Modelo 3", 12)));
        // Para imprimir debe tener el metodo toString
        ofertas.forEach(System.out::println);
    }
}
