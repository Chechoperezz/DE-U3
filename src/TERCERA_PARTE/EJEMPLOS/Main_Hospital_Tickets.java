package TERCERA_PARTE.EJEMPLOS;

import TERCERA_PARTE.EJEMPLOS.CALLCENTER.GestorDeLlamadas;
import TERCERA_PARTE.EJEMPLOS.HOSPITAL.GestorPacientes;
import TERCERA_PARTE.EJEMPLOS.TICKETS.GestorTIckets;

public class Main_Hospital_Tickets {
    public static void main(String[] args) {

        GestorPacientes gestorPacientes = new GestorPacientes();
        GestorTIckets gestorTIckets = new GestorTIckets();
        GestorDeLlamadas gestorDeLlamadas = new GestorDeLlamadas();


        // GESOR DE PACIENTES Y TICKETS USAN DEQUEUE Y QUEUE

        gestorPacientes.agregarPaciente();
        gestorPacientes.GestionarFIFO();
        gestorPacientes.GestionarLIFO();

        gestorTIckets.agregarTicket();
        gestorTIckets.GestionarFIFO();
        gestorTIckets.GestionarLifo();


        //EL GESTOR DE LLAMADAS USA UN STACK
        gestorDeLlamadas.agregarLLamada();
        gestorDeLlamadas.GestionarLlamadas();



    }
}