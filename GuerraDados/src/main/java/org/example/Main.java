package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¿Nombre del jugador 1?");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        JugadorGuerra jugador = new JugadorGuerra(nombre, 10);

        System.out.println("¿Nombre del jugador 2?");
        Scanner teclado1 = new Scanner(System.in);
        String nombre1 = teclado1.nextLine();
        JugadorGuerra jugador1 = new JugadorGuerra(nombre1, 10);

        Dado dado = new Dado(6);

        boolean bool = true;

        while (bool){
            System.out.println("Ahora se tirara el dado");
            int i = dado.tirada();
            System.out.println("El jugador " + jugador.nombre + " ha sacado un " + i);
            System.out.println("El jugador " + jugador1.nombre + " ha sacado un " + dado.tirada());
            if (i > dado.ultimoResultado){
                System.out.println("El jugador " + jugador.nombre + " ha ganado");
                jugador.numeroFichas += 1;
                jugador1.numeroFichas -= 1;
                if (jugador1.numeroFichas == 0){
                    System.out.println("El jugador " + jugador.nombre + " ha ganado la partida");
                    bool = false;
                }
            } else if (i < dado.ultimoResultado){
                System.out.println("El jugador " + jugador1.nombre + " ha ganado");
                jugador1.numeroFichas += 1;
                jugador.numeroFichas -= 1;
                if (jugador.numeroFichas == 0) {
                    System.out.println("El jugador " + jugador1.nombre + " ha ganado la partida");
                    bool = false;
                }
                } else if (i == dado.ultimoResultado){
            System.out.println("Empate");
            }
            System.out.println("Marcador: " + jugador.nombre + " " + jugador.numeroFichas + " - " + jugador1.nombre + " " + jugador1.numeroFichas);

        }


    }
}