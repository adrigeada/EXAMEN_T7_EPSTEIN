package org.example;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class EpsteinApp {

    static ArrayList<Famoso> listaEpstein = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);

    static void main() {

        procesarDatos();
        nuevoFamoso();


    }

    public static void procesarDatos(){
        EntradaDatos.generarDatos();
        Queue<Famoso> colaFamosos = EntradaDatos.getDatosActuales();

        System.out.println("Procesando datos desde EntradaDatos...");

        while (!colaFamosos.isEmpty()){

            System.out.println("--Grabando "+colaFamosos.peek());

            Famoso famoso = colaFamosos.poll();
            listaEpstein.add(famoso);

        }
    }

    public static void nuevoFamoso(){
        String nombre = "";
        String pais = "";
        String profesion = "";
        int edad = 0;

        System.out.println("**** APP MANTENIMIENTO LISTA EPSTEIN ****");
        System.out.println("\nInsertando famoso...");

        System.out.println("Nombre: ");
        nombre = teclado.nextLine();
        System.out.println("País: ");
        pais = teclado.nextLine();
        System.out.println("Profesión: ");
        profesion = teclado.nextLine();
        System.out.println("Edad:");
        edad = teclado.nextInt();
        teclado.nextLine();

        Famoso famoso = new Famoso(nombre,pais,profesion,edad);
        listaEpstein.add(famoso);

        System.out.println("Famoso insertado.");
    }

    public static void buscarFamoso(){

        System.out.println("Buscando famoso...");

    }

    public static void eliminarMenores(){


    }

    public static Estadistica generarEstadistica(){
        return null;
    }
}
