
package com.mycompany.cinemaseat;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mateo
 */

public class CinemaSeat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Registro de usuario y configuración inicial
        System.out.println("Bienvenido a CinemaSeat");
        System.out.print("Ingrese su nombre para registrarse: ");
        String nombreUsuario = scanner.nextLine();
        ClienteCine cliente = new ClienteCine(nombreUsuario);
        FuncionCine funcion = new FuncionCine();
        funcion.registrar(cliente);
        System.out.println("Registro exitoso. Bienvenido, " + nombreUsuario + "!");

        // 2. Creación de la sala y los asientos
        SalaCine sala = new SalaCine();
        FilaAsientosExtendida fila = new FilaAsientosExtendida();

        // Se añaden instancias de cada tipo de asiento a la fila
        fila.agregar(new AsientoVIP());
        fila.agregar(new AsientoEstandar());
        fila.agregar(new Asiento4D());
        sala.agregar(fila);

        // 3. Menú interactivo
        int opcion = 0;
        do {
            try {
                System.out.println("\n--- Menu de opciones ---");
                System.out.println("1. Ver mapa de asientos");
                System.out.println("2. Reservar asiento");
                System.out.println("3. Ver disponibilidad total");
                System.out.println("4. Cancelar función (simular)");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        System.out.println("\n--- Mapa de Asientos ---");
                        sala.mostrar();
                        break;
                    case 2:
                        System.out.println("\n¿Qué tipo de asiento desea reservar?");
                        TipoAsiento[] tiposDeAsiento = TipoAsiento.values();
                        for (int i = 0; i < tiposDeAsiento.length; i++) {
                            System.out.println((i + 1) + ". " + tiposDeAsiento[i]);
                        }
                        System.out.print("Ingrese opcion: ");
                        int tipoSeleccionadoIdx = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (tipoSeleccionadoIdx >= 0 && tipoSeleccionadoIdx < tiposDeAsiento.length) {
                            TipoAsiento tipoAReservar = tiposDeAsiento[tipoSeleccionadoIdx];
                            
                            // La lógica de reserva se delega completamente a la sala.
                            Asiento asientoReservado = sala.reservarAsientoPorTipo(tipoAReservar);

                            if (asientoReservado != null) {
                                System.out.println("¡Reserva exitosa para asiento " + asientoReservado.getTipo() + "!");
                            } else {
                                System.out.println("Lo sentimos, no hay asientos disponibles del tipo " + tipoAReservar + ".");
                            }
                        } else {
                            System.out.println("Opción de asiento no válida.");
                        }
                        break;
                    case 3:
                        System.out.println("\n¿Hay asientos disponibles en la sala?: " + (sala.estaDisponible() ? "Sí" : "No"));
                        break;
                    case 4:
                        funcion.cambiarEstado(EstadoFuncion.CANCELADA);
                        System.out.println("La función ha sido cancelada. Se ha notificado a los suscriptores.");
                        break;
                    case 5:
                        System.out.println("\nGracias por usar CinemaSeat. ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }

        } while (opcion != 5);

        cliente.notificar("¡CinemaSeat agradece el uso de la app!");
        scanner.close();
    }
}

 /*
public class CinemaSeat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registro de usuario
        System.out.println("Bienvenido a CinemaSeat");
        System.out.print("Ingrese su nombre para registrarse: ");
        String nombreUsuario = scanner.nextLine();
        ClienteCine cliente = new ClienteCine(nombreUsuario);
        FuncionCine funcion = new FuncionCine();
        funcion.registrar(cliente);
        System.out.println("Registro exitoso. Bienvenido, " + nombreUsuario + "!");

        // Crear sala y fila con 1 asiento de cada tipo
        SalaCine sala = new SalaCine();
        FilaAsientosExtendida fila = new FilaAsientosExtendida();

        AsientoVIP vip = new AsientoVIP();
        AsientoEstandar estandar = new AsientoEstandar();
        Asiento4D cuatroD = new Asiento4D();
        ClienteCine cinec=new ClienteCine(nombreUsuario);

        fila.agregarAsiento(vip);
        fila.agregarAsiento(estandar);
        fila.agregarAsiento(cuatroD);
        sala.agregar(fila);

        // Menú de opciones
        int opcion;
        do {
            System.out.println(" Menu de opciones:");
            System.out.println("1. Ver mapa de asientos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Ver disponibilidad");
            System.out.println("4. Cancelar función (simular)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcin: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
switch (opcion) {
                case 1:
                    System.out.println(" Mapa de Asientos:");
                    sala.mostrar();
                    break;
                case 2:
                    System.out.println("¿Qué tipo de asiento desea reservar?");
                    System.out.println("1. VIP");
                    System.out.println("2. Estandar");
                    System.out.println("3. 4D");
                    System.out.print("Ingrese opcion: ");
                    int tipo = scanner.nextInt();

                    Asiento asientoSeleccionado = null;
                    if (tipo == 1) asientoSeleccionado = vip;
                    else if (tipo == 2) asientoSeleccionado = estandar;
                    else if (tipo == 3) asientoSeleccionado = cuatroD;

                    if (asientoSeleccionado != null && asientoSeleccionado.estaDisponible()) {
                        asientoSeleccionado.setDisponible(false);
                        System.out.println(" ¡Reserva exitosa!");
                    } else {
                        System.out.println(" Asiento no disponible o invalido.");
                    }
                    break;
                case 3:
                    System.out.println(" ¿Hay asientos disponibles?: " + sala.estaDisponible());
                    
                    break;
                case 4:
                    funcion.cambiarEstado(EstadoFuncion.CANCELADA);
                    
                    break;
                case 5:
                    System.out.println("? Gracias por usar CinemaSeat. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println(" Opcion no valida.");
            }

        } while (opcion != 5);
        System.out.println("...");
        cinec.notificar("¡ CinemaSeat agradece el uso de la app ! ");
        scanner.close();
    }
}
 */