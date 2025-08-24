
package com.mycompany.cinemaseat;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
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
