package semana07LinkedListIntroMethods;

import java.util.Arrays;
import java.util.LinkedList;

public class L02InsertarInicio {
    
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(20,30,40,50));
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        System.out.println("");
        // 1. Insertar el valor 15 al inicio de la lista
        lista.addFirst(15);
        
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        
        
        System.out.println("");
        // 2. Insertar el valor 10 al inicio de la lista
        lista.addFirst(10);
        
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        
        
        System.out.println("");
        // 3. Insertar el valor 05 al inicio de la lista
        lista.addFirst(05);
        
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        
        
    }
}
