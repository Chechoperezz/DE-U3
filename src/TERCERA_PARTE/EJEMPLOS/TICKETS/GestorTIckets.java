import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GestorTIckets {

    static Queue<Tickets> ticketsQueue = new LinkedList<>();
    static Stack<Tickets> ticketsStack = new Stack<>();

    public void GestionarFIFO() {
        System.out.println("QUEUE DE TICKETS");
        while (!ticketsQueue.isEmpty()) {
            Tickets tickets = ticketsQueue.poll();
            System.out.println("TICKET ASIGNADO: " + tickets);
        }
        System.out.println("LISTA DE TICKETS VACIA");

    }

    public void GestionarLifo() {
        System.out.println("STACK DE TICKETS");
        while (!ticketsStack.isEmpty()) {
            Tickets tickets = ticketsStack.pop();
            System.out.println("TICKET ASIGNADO : " + tickets);
        }
    }

    public void agregarTicket() {

        Scanner scn = new Scanner(System.in);

        String respuesta;
        do {
            Tickets tickets = new Tickets();
            System.out.println("NOMBRE DE CLIENTE: ");
            String nombre = scn.nextLine();

            tickets.setNombreDeCliente(nombre);
            tickets.setPrioridad(AsignarPrioridadTicket());

            System.out.println("¿Desea agregar otro paciente? (s/n)");
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
