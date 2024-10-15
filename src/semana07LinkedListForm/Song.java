package semana07LinkedListForm;

import java.util.Comparator;

public class Song implements Comparable<Song>{
    private String titulo, artista;

    public Song() {
    }

    public Song(String titulo, String artista) {
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
    public int compareTo(Song o) {
        return Comparator.comparing(Song::getTitulo).thenComparing(Song::getArtista).compare(this, o);
    }
    
    
}
