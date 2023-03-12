package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Clientes clientes = new Clientes();
        Videos listaVideos = new Videos();
        Libros miBiblioteca = new Libros();
        Pedidos pedidos = new Pedidos();



        int numeroClientes = 0;

        boolean bool = true;

        while (bool) {
            System.out.println("--Menu--");
            System.out.println("1. Mostrar clientes");
            System.out.println("2. Crear un cliente");
            System.out.println("3. Crear una obra");
            System.out.println("4. Crear un pedido");
            System.out.println("5. Mostrar pedidos");
            System.out.println("6. Salir");
            int opcion = 0;
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    clientes.mostrarClientes();
                    break;
                case 2:
                    System.out.println("¿Nombre?");
                    Scanner teclado1 = new Scanner(System.in);
                    String nombre = teclado1.nextLine();
                    numeroClientes += 1;
                    clientes.agregarCliente(nombre, numeroClientes);
                    System.out.println("Cliente n.º " + numeroClientes + " [ " + nombre + " ] añadido");
                    break;

                case 3:
                    System.out.println("¿Tipo?");
                    System.out.println("1. Libro");
                    System.out.println("2. Video");
                    Scanner teclado2 = new Scanner(System.in);
                    int tipo = teclado2.nextInt();
                    switch (tipo) {
                        case 1:
                            System.out.println("¿Titulo?");
                            Scanner teclado3 = new Scanner(System.in);
                            String titulo = teclado3.nextLine();
                            System.out.println("¿Autor?");
                            Scanner teclado4 = new Scanner(System.in);
                            String autor = teclado4.nextLine();
                            System.out.println("¿Numero de paginas?");
                            Scanner teclado5 = new Scanner(System.in);
                            int paginas = teclado5.nextInt();
                            Libros libro = new Libros(titulo, autor, paginas);
                            miBiblioteca.agregarLibro(libro);
                            System.out.println("Libro " + libro.titulo + " añadido");
                            break;
                        case 2:

                            System.out.println("¿Titulo?");
                            Scanner teclado6 = new Scanner(System.in);
                            String titulo2 = teclado6.nextLine();
                            System.out.println("¿Autor?");
                            Scanner teclado7 = new Scanner(System.in);
                            String autor2 = teclado7.nextLine();
                            System.out.println("¿Duracion?");
                            Scanner teclado8 = new Scanner(System.in);
                            int duracion = teclado8.nextInt();
                            Videos video = new Videos(titulo2, autor2, duracion);
                            listaVideos.agregarVideo(video);
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Para que cliente?");
                    clientes.mostrarClientes();
                    Scanner teclado9 = new Scanner(System.in);
                    int cliente = teclado9.nextInt();
                    if (cliente > clientes.clientes.size()) {
                        System.out.println("Cliente no valido");
                    } else {
                        boolean bool2 = true;
                        ArrayList<Object> obras = new ArrayList<>();
                        while (bool2) {
                            System.out.println("¿Que obra agregar al pedido?");
                            System.out.println("1. Libro");
                            System.out.println("2. Video");
                            System.out.println("3. Salir");
                            Scanner teclado10 = new Scanner(System.in);
                            int obra = teclado10.nextInt();
                            switch (obra) {

                                case 1:
                                    System.out.println("¿Que libro?");
                                    System.out.println(miBiblioteca.mostrarLibros());
                                    Scanner teclado11 = new Scanner(System.in);
                                    int libro = teclado11.nextInt();
                                    if (libro > miBiblioteca.getLibros().size()) {
                                        System.out.println("Libro no valido");
                                    } else {
                                        obras.add(miBiblioteca.getLibros().get(libro - 1));
                                        System.out.println("Libro añadido al pedido");
                                    }
                                    break;
                                case 2:
                                    System.out.println("¿Que video?");
                                    System.out.printf(listaVideos.mostrarVideos());
                                    Scanner teclado12 = new Scanner(System.in);
                                    int video = teclado12.nextInt();
                                    if (video > listaVideos.getVideos().size()) {
                                        System.out.println("Video no valido");
                                    } else {
                                        obras.add(listaVideos.getVideos().get(video - 1));
                                        System.out.println("Video añadido al pedido");
                                    }
                                    break;
                                case 3:
                                    bool2 = false;
                                    pedidos.agregarPedido(clientes.buscarCliente(cliente), obras);
                                    break;
                            }

                        }
                    }
                    break;

                case 5:
                    pedidos.mostrarPedidos();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    bool = false;
                    break;


                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }
}
