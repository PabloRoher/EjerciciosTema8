package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Videos extends Obra{

    ArrayList<Videos> listaVideos;
    int duracion;


    public Videos() {
        listaVideos = new ArrayList<>();
    }
    public Videos(String titulo, String autor, int duracion) {
        super(titulo, autor);
        this.duracion = duracion;
    }

    public ArrayList<Videos> getVideos() {
        return listaVideos;
    }

    public void setVideos(ArrayList<Videos> videos) {
        this.listaVideos = videos;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void agregarVideo(Videos video){
        listaVideos.add(video);
    }

    public String mostrarVideos() {
        String videos = "";
        int numeroDeVideo = 1;
        for (int i = 0; i < listaVideos.size(); i++) {
            videos += "Nº de video: " + numeroDeVideo + " - " + "Titulo: " + listaVideos.get(i).getTitulo() + " - " + "Autor: " + listaVideos.get(i).getAutor() + " - " + "Duración: " + listaVideos.get(i).getDuracion() + " minutos \n";
            numeroDeVideo++;
        }
        return videos;
    }

    @Override
    public String toString() {
        return "- Vídeo " +  titulo + " de " +  autor +  " con una duración de " + duracion + " minutos";

    }
}
