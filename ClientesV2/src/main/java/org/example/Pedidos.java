package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pedidos {

    HashMap<Object, Object> pedidos = new HashMap<>();

    public void agregarPedido(String cliente, ArrayList<Object> obras){
        pedidos.put(cliente, obras);
    }

    public void mostrarPedidos(){
        System.out.println("--Pedidos--");
        for(Map.Entry<Object,Object> entry : pedidos.entrySet()){
            System.out.println("Pedido de: \n" + entry.getKey() + "\n" + " Obra: " + entry.getValue());
        }
    }
}
