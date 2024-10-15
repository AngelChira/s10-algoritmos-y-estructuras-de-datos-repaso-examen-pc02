package semana06ArrayListIntroMethods;

import java.util.ArrayList;

public class A02TamanioComprarListaVaciaContieneElemento {
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(1);
        lista.add(8);

        // 1. Obtener y mostrar el tamaño de la variable lista
        // size -> Devuelve un entero del tamañio de la lista (cuantos elementos hay
            System.out.println("Tamanio: "+lista.size());
        // 2. Comprobar si la lista esta vacia
        // isEmpty -> Devuelve un true en caso este vacia y false en caso este llena
            System.out.println("Esta vacia: " + lista.isEmpty());
        // 3. Comprobar si la lista contiene el elemento 100
        // contains -> Devuelve un true en caso contien el elemnto y false en caso no lo tenga
            System.out.println("Contiene el elemento 100: " + lista.contains(100));
    }
}
