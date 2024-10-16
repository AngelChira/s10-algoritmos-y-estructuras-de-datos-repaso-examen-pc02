package semana08ListaEnlazadaSimple;

public class Nodo {
    private int numero;
    Nodo siguiente;

    public Nodo(int numero, Nodo siguiente) {
        this.numero = numero;
        this.siguiente = siguiente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

 
}
