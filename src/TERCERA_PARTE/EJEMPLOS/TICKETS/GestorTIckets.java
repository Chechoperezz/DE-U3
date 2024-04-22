package TERCERA_PARTE.EJEMPLOS.TICKETS;

import TERCERA_PARTE.EJEMPLOS.HOSPITAL.Prioridad;

import java.util.*;

public class GestorTIckets {

    static Queue<Tickets> ticketsQueue = new LinkedList<>();
    static Deque<Tickets> ticketsDeque = new LinkedList<>();


    public void GestionarFIFO() {
        System.out.println("QUEUE DE TICKETS");
        while (!ticketsQueue.isEmpty()) {
            Tickets tickets = ticketsQueue.poll();
            System.out.println("TICKET ASIGNADO: " + tickets);
        }
        System.out.println("LISTA DE TICKETS VACIA");

    }

    //AMBOS METODOS ITERAN DESDE IZQUIERDA A DERECHA
    //LA DIFERENCIA MAS IMPORTANTE, ES LA INCERSION DE DATOS DESDE EL PRINCIPIO
    public void GestionarLifo() {
        System.out.println("DEQUEUE DE TICKETS");
        while (!ticketsDeque.isEmpty()) {
            Tickets tickets = ticketsDeque.pop();
            System.out.println("TICKET ASIGNADO : " + tickets.toString());
        }
        System.out.println("LISTA DE TICKETS VACIA");
    }


    public void agregarTicket() {

        Scanner scn = new Scanner(System.in);

        String respuesta;
        do {
            Tickets tickets = new Tickets();
            System.out.println("NOMBRE DE CLIENTE: ");
            String nombre = scn.nextLine();

            tickets.setNombreDeCliente(nombre);

            //LA PRIORIDAD NO INFLUYE EN LA INCERSION DE DATOS
            tickets.setPrioridad(AsignarPrioridadTicket());

            ticketsQueue.offer(tickets);// SE AGREGA EL TICKET AL FINAL DE LA QUEUE
            ticketsDeque.push(tickets); // SE AGREGA EL TICKET AL INICIO DE LA DEQUEUE

            System.out.println("¿Desea agregar otro ticket? (s/n)");
            respuesta = scn.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public Prioridad AsignarPrioridadTicket() {

        Scanner scn = new Scanner(System.in);
        System.out.println("INGRESE PRIORIDAD DEL TICKET");
        String Prioridad1 = scn.nextLine();


        if (Prioridad1.equalsIgnoreCase("ALTA")) {
            return Prioridad.ALTA;
        } else if (Prioridad1.equalsIgnoreCase("MODERADA")) {
            return Prioridad.MODERADA;

        } else {
            return Prioridad.BAJA;
        }
    }
}
