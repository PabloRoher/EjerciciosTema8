package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Libros extends Obra{

    private ArrayList<Libros> listaLibros;
    int numeroDePaginas;
    public Libros() {
        listaLibros = new ArrayList<>();
    }
    public Libros(String titulo, String autor, int numeroDePaginas) {
        super(titulo, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public ArrayList<Libros> getLibros() {
        return listaLibros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.listaLibros = libros;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void agregarLibro(Libros libro){
        listaLibros.add(libro);
    }

    public String mostrarLibros() {
        String libros = "";
        int numeroDeLibro = 1;
        for (int i = 0; i < listaLibros.size(); i++) {
            libros += "Nº de libro: " + numeroDeLibro + " - " + "Titulo: " + listaLibros.get(i).getTitulo() + " - " + "Autor: " + listaLibros.get(i).getAutor() + " - " + "Número de páginas: " + listaLibros.get(i).getNumeroDePaginas() + " páginas \n";
            numeroDeLibro++;
        }
        return libros;
    }

    @Override
    public String toString() {
        return "- Libro Java: " + titulo + " de " + autor  + numeroDePaginas + " páginas)";
    }
}