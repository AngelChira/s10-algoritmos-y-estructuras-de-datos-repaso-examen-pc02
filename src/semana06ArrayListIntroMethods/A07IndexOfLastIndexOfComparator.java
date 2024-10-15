package semana06ArrayListIntroMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class A07IndexOfLastIndexOfComparator {

    public static void main(String[] args) {
        ArrayList<String> sedes = new ArrayList<>(
                Arrays.asList("Chiclayo", "Lima", "Piura", "Arequipa", "Trujillo", "Tacna"));
        for (String sede : sedes) {
            System.out.println(sede);
        }
        System.out.println("");
        
        // 1. Obtener el índice del elemento "Chiclayo" (con el método indexOf)
        // indexof -> Devuelve la posición del elemtno en caso exista pero si no existe
        // devuelve -1
        System.out.println(sedes.indexOf("Chiclayo"));
        
        // 2. Obtener el índice del ultimo elemento "Chiclayo" (con el método lastIndexOf)
        System.out.println(sedes.lastIndexOf("Tacna"));
        
        // 3. Ordenar con el metodo sort utilizando el orden natural 
        // ascendente
        System.out.println("");
        sedes.sort(Comparator.naturalOrder());
        for (String sede : sedes) {
            System.out.println(sede);
        }
        // descendente
        sedes.sort((Comparator<? super String>) Comparator.naturalOrder().reversed());
        System.out.println("");
        // 4. Mostrar las sedes iterando con forEach
        for (String sede : sedes) {
            System.out.println(sede);
        }
    }
}
