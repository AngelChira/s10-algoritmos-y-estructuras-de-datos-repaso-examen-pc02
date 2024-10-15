package semana07LinkedListIntroMethods;

import java.util.Arrays;
import java.util.LinkedList;

public class L04InsertarIndice {
    
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(10,30,40,50));
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        System.out.println("");
        
        // 1. Insertar el valor 20 despues del nodo con valor 10
        lista.add(1, 20);
        
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        System.out.println("");
        
        // 10,20,30,40,50
        // 2. Insertar el valor 25 despues del nodo con valor 20
        lista.add(2, 25);
        
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        System.out.println("");
        
        // 10,20,25,30,40,50
        // 3. Insertar el valor 35 despues del nodo con valor 30
        lista.add(4, 35);
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        
    }
}
