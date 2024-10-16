package semana08ListaEnlazadaSimple;

import javax.swing.JOptionPane;

public class Lista {
    Nodo inicio;
    Nodo fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    
    public void insertarInicio(int numer) {
        Nodo nuevo = new Nodo(numer, inicio);
        inicio = nuevo;
        if (fin == null) {
            fin = inicio;
        }
    }
    
    public void insertarFinal(int numer) {
        Nodo nuevo = new Nodo(numer, null);
        if (inicio == null) {
            fin =nuevo;
            inicio = fin;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public void insertarPosicion(int numer, int posicion) {
        if (posicion < 0) {
            JOptionPane.showMessageDialog(null, "Error, la posición es menor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Nodo nuevo = new Nodo(numer, null);
        if (posicion == 0) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            if (fin == null) {
                fin = inicio;
            }
        } else {
            Nodo actual = inicio;
            int contador = 0;
            while (actual != null && contador < posicion - 1) {
                actual = actual.getSiguiente();
                contador++;
            }
            if (actual == null) {
                JOptionPane.showMessageDialog(null, "Posición inválida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
            if (nuevo.getSiguiente() == null) {
                fin = nuevo;
            }
            
        }
    }
    
    public void eliminarIncio() {
        if(inicio == null || fin == null) {
            JOptionPane.showMessageDialog(null, "No hay elementos.");
        } else {
            inicio = inicio.getSiguiente();
        }
    }
    
    public void eliminarFinal() {
        if(inicio == null || fin == null) {
            JOptionPane.showMessageDialog(null, "No hay elementos.");
            return;
        } 
        
        if ( inicio == fin) {
            fin = null;
            inicio = fin;
        } else {
            Nodo actual = inicio;
            while (actual.getSiguiente() != fin) {                
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
            fin = actual;
        }
    }
    
    public void eliminarPosicion(int posicion) {
        if (posicion < 0) {
            JOptionPane.showMessageDialog(null, "Error, la posición es menor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (posicion == 0) {
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                fin = null;
            }
        } else {
            Nodo actual = inicio;
            int contador = 0;
            while (actual != null && contador < posicion - 1) {
                actual = actual.getSiguiente();
                contador++;
            }
            if (actual == null || actual.getSiguiente() == null) {
                JOptionPane.showMessageDialog(null, "Posición inválida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            if (actual.getSiguiente() == null) {
                fin = actual;
            }
            
            
        }
    }
    
    public boolean BuscarNumero(int numero ) {
        Nodo actual = inicio;
        while(actual != null) {
            if (actual.getNumero() == numero) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    
    public String BuscarNumeroPosicion(int posicion) {
        Nodo actual = inicio;
        int index = 0;
        String buscar = "";
        while(actual != null && index < posicion - 1 ){
            actual = actual.getSiguiente();
            index++;
        }
        if ( actual == null || actual.getSiguiente() == null ) {
            buscar = "posicion fuera del rango.";
        } else {
            buscar = "Se encontra el numero : \n"+ String.valueOf(actual.getSiguiente().getNumero());
        }
        return buscar;
    }
    
    public void actualizarNumeroPosicion(int numer, int posicion) {
        Nodo actual = inicio;
        int index = 0;
        while(actual != null && index < posicion ){
            actual = actual.getSiguiente();
            index++;
        }
        if ( actual == null) {
            JOptionPane.showMessageDialog(null, "posicion fuera del rango.");
        } else {
            actual.setNumero(numer);
        }
        
        
    }
}
