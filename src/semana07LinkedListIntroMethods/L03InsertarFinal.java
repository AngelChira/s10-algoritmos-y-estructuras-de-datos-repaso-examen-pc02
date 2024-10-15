package semana07LinkedListIntroMethods;

import java.util.Arrays;
import java.util.LinkedList;

public class L03InsertarFinal {
 
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(10,20,30));
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        System.out.println("");
        
        // 1. Insertar el valor 40 al final de la lista
        // con addLast
        lista.addLast(40);
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        System.out.println("");
        
        // 1. Insertar el valor 40 al final de la lista
        // con add
        lista.add(50);
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        System.out.println("");
        
        // 1. Insertar el valor 65 al final de la lista
        // con addLast
        lista.addLast(65);
        for(Integer item:lista) {
            System.out.println(""+item);
        }
        System.out.println("");
    }
}
