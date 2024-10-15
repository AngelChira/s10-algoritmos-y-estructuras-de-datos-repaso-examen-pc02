package semana06ArrayListForm;

import java.util.Comparator;
import java.util.Objects;

public class Cancion implements Comparable<Cancion>{
    private String titulo, artista;

    public Cancion() {
    }

    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.artista, other.artista);
    }

    @Override
    public int compareTo(Cancion o) {
        return Comparator.comparing(Cancion::getTitulo).thenComparing(Cancion::getArtista).compare(this, o);
    }
    
    
}
