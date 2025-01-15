package Tema4.ejercicio4;


import java.util.ArrayList;
import java.util.Objects;

public class DvdCine {
    private String titulo;
    private String director;
    private String productora;
    private ArrayList<String> actores=new ArrayList();
    private Genero genero;
    private String resumen;
    private int duracion;
    public DvdCine (String titulo, String director, String productora, ArrayList<String> actores, Genero genero, String resumen, int duracion){
        this.titulo=titulo;
        this.director=director;
        this.productora=productora;
        this.actores=actores;
        this.genero=genero;
        this.resumen=resumen;
        this.duracion=duracion;
    }

    public DvdCine(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
     //GETTER Y SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean esThriller() {
        return this.genero.equals(Genero.THRILLER);
        //return this genero== Genero.THERILLER
    }
    public boolean mismaProductora (DvdCine otro){
        return this.productora.equals(otro.getProductora());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DvdCine dvdCine = (DvdCine) o;
        return Objects.equals(titulo, dvdCine.titulo) && Objects.equals(director, dvdCine.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, director);
    }

    @Override
    public String toString() {
        return "DvdCine{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", productora='" + productora + '\'' +
                ", actores=" + actores +
                ", genero=" + genero +
                ", resumen='" + resumen + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}

