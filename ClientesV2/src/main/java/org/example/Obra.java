package org.example;

import java.util.HashMap;

public class Obra {
    String titulo;
    String autor;


    public Obra(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Obra() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public HashMap<Object, Object> getObras() {
        return obras;
    }

    public void setObras(HashMap<Object, Object> obras) {
        this.obras = obras;
    }

    HashMap<Object, Object> obras = new HashMap<>();

        public void agregarObra(Object obra,int numeroObra){
            obras.put(numeroObra, obra);
        }
}
