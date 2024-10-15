package semana07LinkedListIntroMethods;

import java.util.Arrays;
import java.util.LinkedList;

public class L05InsertarOthers {
    
    public static void main(String[] args) {
        LinkedList<String> team1 = new LinkedList<>(Arrays.asList("Juan","Rosa","Ana"));
        LinkedList<String> team2 = new LinkedList<>(Arrays.asList("Julio","Maria","Cesar"));
        LinkedList<String> team3 = new LinkedList<>(Arrays.asList("Alex","Billy"));
        
        // 1. Agregar al team1 todos los elementos del team2
        System.out.print("Antes: ");
        for(String team : team1) {
            System.out.print(team+" ");
        }
        team1.addAll(team2);
        System.out.print("\nDespues: ");
        for(String team : team1) {
            System.out.print(team+" ");
        }
        System.out.println("\n");
        
        // 2. Agregar al team2 todos los elementos del team1
        System.out.print("Antes: ");
        for(String team : team2) {
            System.out.print(team+" ");
        }
        team2.addAll(team1);
        System.out.print("\nDespues: ");
        for(String team : team2) {
            System.out.print(team+" ");
        }
        System.out.println("\n");
        
        // 3. Agregar todos los elementos del team3 en el indice 2 de la lista team1
        System.out.print("Antes: ");
        for(String team : team1) {
            System.out.print(team+" ");
        }
        team1.addAll(2,team3);
        System.out.print("\nDespues: ");
        for(String team : team1) {
            System.out.print(team+" ");
        }
        System.out.println("");
    }
}
