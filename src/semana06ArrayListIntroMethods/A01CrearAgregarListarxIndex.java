package semana06ArrayListIntroMethods;

import java.util.ArrayList;

public class A01CrearAgregarListarxIndex {
    
    public static void main(String[] args) {
        // 1. Crear un ArrayList de tipo Integer llamada lista
        ArrayList<Integer> lista = new ArrayList<>();
        
        // 2. Agregar 3 elementos
        // list.add -> devuelve un boolean
        lista.add(20);
        lista.add(30);
        lista.add(40);
        for(int numero : lista) {
            System.out.println(numero);
        }
        
        // 3. Obtener el primer elemento (con el método get)
        System.out.println("Primer elemento:"+lista.get(0));
    }
}
