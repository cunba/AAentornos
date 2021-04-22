package com.sanvalero.aplicacion;

import com.sanvalero.domain.Coche;
import com.sanvalero.domain.Comprador;
import com.sanvalero.domain.Vendedor;

import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {

    private final Scanner leer;
    private boolean salir;
    private final ArrayList<Coche> coches;
    private final ArrayList<Comprador> compradores;
    private final ArrayList<Vendedor> vendedores;

    public Concesionario() {
        salir = false;
        leer = new Scanner(System.in);
        coches = new ArrayList<>();
        compradores = new ArrayList<>();
        vendedores = new ArrayList<>();
    }

    public void menuInicial() {
        do {
            System.out.println(" ___________________________________________________________________________________________");
            System.out.println("|                                                                                           |");
            System.out.println("|                           MENÚ INICIAL DE GESTIÓN DE CONCESIONARIO                        |");
            System.out.println("|___________________________________________________________________________________________|");
            System.out.println(" ");
            System.out.println("    1.  Registrar coche.");
            System.out.println("    2.  Visualizar coche.");
            System.out.println("    3.  Registrar vendedor.");
            System.out.println("    4.  Visualizar vendedor.");
            System.out.println("    5.  Registrar Comprador.");
            System.out.println("    6.  Visualizar comprador");
            System.out.println("    S.  Salir.");
            System.out.println(" ");
            System.out.print("Por favor, seleccione la acción que desee realizar: ");
            String opcion = leer.nextLine();

            switch (opcion) {
                case "1":
                    registrarCoche();
                    break;
                case "2":
                    verCoche();
                    break;
                case "3":
                    registrarVendedor();
                    break;
                case "4":
                    verVendedor();
                    break;
                case "5":
                    registrarComprador();
                    break;
                case "6":
                    verComprador();
                    break;
                case "s": case "S":
                    salir();
                    break;
                default:
                    System.out.println("Opción incorrecta, inténtelo de nuevo.");
            }
        } while (!salir);
    }

    public void registrarCoche(){
        System.out.println("Escriba a continuación los datos del coche:");
        System.out.print("ID: ");
        String id = leer.nextLine();
        System.out.print("Matricula: ");
        String matricula = leer.nextLine();
        System.out.print("Marca: ");
        String marca = leer.nextLine();
        System.out.print("Modelo: ");
        String modelo = leer.nextLine();
        System.out.print("Tipo: ");
        String tipo = leer.nextLine();
        System.out.print("Caballos: ");
        int caballos = leer.nextInt();
        System.out.print("Precio: ");
        float precio = leer.nextFloat();

        Coche coche = new Coche(id, matricula, marca, modelo, tipo, caballos);
        coche.setPrecio(precio);

        coches.add(coche);

        System.out.println(" ");
        otraOperacion();
    }

    public void verCoche(){
        System.out.println(" ");
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }
        System.out.println(" ");
        otraOperacion();
    }

    public void registrarVendedor(){
        System.out.println("Escriba a continuación los datos del vendedor: ");
        System.out.print("ID: ");
        String id = leer.nextLine();
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Apellido: ");
        String apellido = leer.nextLine();
        System.out.print("DNI: ");
        String dni = leer.nextLine();
        System.out.print("Teléfono: ");
        String telefono = leer.nextLine();
        System.out.print("Correo electrónico: ");
        String email = leer.nextLine();
        System.out.print("Sueldo: ");
        float sueldo = leer.nextFloat();
        System.out.println("Coches vendidos: ");
        int cochesVendidos = leer.nextInt();

        Vendedor vendedor = new Vendedor(id, nombre, apellido, dni, telefono, email, sueldo);
        vendedor.setCochesVendidos(cochesVendidos);

        vendedores.add(vendedor);

        System.out.println(" ");
        otraOperacion();
    }

    public void verVendedor(){
        System.out.println(" ");
        for(Vendedor vendedor: vendedores){
            System.out.println(vendedor.toString());
        }
        System.out.println(" ");
        otraOperacion();
    }

    public void registrarComprador(){
        System.out.println("Escriba a continuación los datos del comprador: ");
        System.out.print("ID: ");
        String id = leer.nextLine();
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Apellido: ");
        String apellido = leer.nextLine();
        System.out.print("DNI: ");
        String dni = leer.nextLine();
        System.out.print("Teléfono: ");
        String telefono = leer.nextLine();
        System.out.print("Correo electrónico: ");
        String email = leer.nextLine();
        System.out.print("Importe a pagar: ");
        float importe = leer.nextFloat();
        System.out.print("Coches comprados: ");
        int cochesComprados = leer.nextInt();

        Comprador comprador = new Comprador(id, nombre, apellido, dni, telefono, email, importe);
        comprador.setCochesComprados(cochesComprados);

        compradores.add(comprador);

        System.out.println(" ");
        otraOperacion();
    }

    public void verComprador(){
        System.out.println(" ");
        for(Comprador comprador : compradores){
            System.out.println(comprador.toString());
        }
        System.out.println(" ");
        otraOperacion();
    }

    private void otraOperacion() {
        System.out.print("¿Desea realizar otra operación?(S o N): ");
        String opcion = leer.nextLine();

        if (opcion.equalsIgnoreCase("n")) {
            salir();
        }
    }

    private void salir() {
        System.out.print("¿Está seguro que quiere salir de la aplicación?(S o N): ");
        String opcion = leer.nextLine();

        if (opcion.equalsIgnoreCase("s")) {
            System.out.println(" ");
            System.out.println("                                      FIN DE EJECUCIÓN");
            System.out.println("_____________________________________________________________________________________________");
            salir = true;
        }
    }
}
