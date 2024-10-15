package semana06ArrayListIntroMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class A04CrearAgregandoDeManeraEstaticaContains {

    public static void main(String[] args) {
        ArrayList<String> sedes = new ArrayList<>(
                Arrays.asList("Chiclayo", "Lima", "Piura", "Arequipa", "Trujillo"));

        // 1. Crear una nueva lista llamada sedes_visitadas con los valores Lima y Piura
        ArrayList<String> sedes_visitadas = new ArrayList<>(
                Arrays.asList("Lima", "Piura"));
        // 2. Comprobar si las sedes_visitadas estan contenidas dentro de sedes
        // containsAll -> Devuelve un bolean pero necesita como argumento una coleción
        System.out.println(" sedesvisitadas está en sedes:" + sedes.containsAll(sedes_visitadas));
        // 3. Agregar "Iquitos" a las sedes_visitadas
        sedes_visitadas.add("Iquitos");
        // 4. Comprobar si las sedes_visitadas estan contenidas dentro de sedes
        System.out.println(" sedesvisitadas está en sedes:" + sedes.containsAll(sedes_visitadas));
    }
}
