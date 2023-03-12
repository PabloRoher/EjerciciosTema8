package org.example;

import java.util.HashMap;
import java.util.Map;

public class Clientes {

    HashMap<String, Integer> clientes = new HashMap<>();

    public Clientes() {
    }

    public HashMap<String, Integer> getClientes() {
        return clientes;
    }

    public void setClientes(HashMap<String, Integer> clientes) {
        this.clientes = clientes;
    }

    public void agregarCliente(String nombre, int numeroCliente){clientes.put(nombre, numeroCliente);
    }

    public void mostrarClientes(){
        for(Map.Entry<String,Integer> entry : clientes.entrySet()){
            System.out.println("Cliente n.º " + entry.getValue() + " [ " + entry.getKey() + " ]");
        }
    }

    public String buscarCliente(int numeroCliente){
        for(Map.Entry<String,Integer> entry : clientes.entrySet()){
            if(entry.getValue() == numeroCliente){
                return entry.getKey();
            }
        }
        return null;
    }



}

