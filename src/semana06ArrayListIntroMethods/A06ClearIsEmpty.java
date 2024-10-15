package semana06ArrayListIntroMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class A06ClearIsEmpty {
    
    public static void main(String[] args) {
        ArrayList<String> sedes = new ArrayList<>(
                Arrays.asList("Chiclayo", "Lima", "Piura", "Arequipa", "Trujillo"));

        // 1. Eliminar todos los elementos de sedes
        // clear -> Procedimiento que remueve todo los elementos de la lista
        sedes.clear();

        // 2. Comprobar si la variable sedes esta vacia
        // isEmpty -> Devuelve un boolean true en caso este vacia y false en caso este llena
        System.out.println("Esta vacia: " + sedes.isEmpty());
    }
}
