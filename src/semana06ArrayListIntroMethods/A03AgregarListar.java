package semana06ArrayListIntroMethods;

import java.util.ArrayList;

public class A03AgregarListar {

    public static void main(String[] args) {
        ArrayList<String> sedes = new ArrayList<>();
        sedes.add("Chiclayo");
        sedes.add("Lima");
        sedes.add("Piura");

        // 1. Iterar todas las ciudades
        for (String item : sedes) {
            System.out.println(item);
        }
        // 2. Agregar la ciudad de Arequipa
        sedes.add("Arequipa");
        // 3. Iterar nuevamente
        System.out.println("");
        for (String item : sedes) {
            System.out.println(item);
        }
    }
}
