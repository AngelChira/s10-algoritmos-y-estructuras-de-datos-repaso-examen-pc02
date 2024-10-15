package semana06ArrayListIntroMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class A05RemoveAllAddAllForEach {

    public static void main(String[] args) {
        ArrayList<String> sedes = new ArrayList<>(
                Arrays.asList("Chiclayo", "Lima", "Piura", "Arequipa", "Trujillo"));

        ArrayList<String> sedes_visitadas = new ArrayList<>(
                Arrays.asList("Chiclayo", "Lima", "Piura", "Arequipa"));
        for (String sede : sedes) {
            System.out.println(sede);
        }
        System.out.println("");
        // 1. Eliminar las sedes_visitadas de la variable sedes
        // removeAll -> Devuelve un boolean pero necesita como argumento una colección
        sedes.removeAll(sedes_visitadas);

        // 2. Iterar la variable sedes
        // ForEach para imprimir la lista
        for (String sede : sedes) {
            System.out.println(sede);
        }
        
        System.out.println("");
        
        // 3. Agregar las sedes_visitadas a la variable sedes
        // addAll -> Devuelve un boolean pero necesita como argumento una coleeción
        sedes.addAll(sedes_visitadas);
        
        // 4. Iterar nuevamente
        for (String sede : sedes) {
            System.out.println(sede);
        }
    }
}
