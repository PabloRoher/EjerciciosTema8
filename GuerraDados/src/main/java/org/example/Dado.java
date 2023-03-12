package org.example;

public class Dado {

    public int numeroCaras;
    public int ultimoResultado;

    public Dado(int numeroCaras) {
        this.numeroCaras = numeroCaras;
    }

    public Dado() {
        this.numeroCaras = 6;
    }

    public int getNumeroCaras() {
        return numeroCaras;
    }

    public int getUltimoResultado() {
        return ultimoResultado;
    }

    public void setNumeroCaras(int numeroCaras) {
        this.numeroCaras = numeroCaras;
    }

    public int tirada(){
        ultimoResultado = (int) (Math.random() * numeroCaras) + 1;
        return ultimoResultado;
    }
}
