import java.util.*;

public class GestorPacientes{

    static Queue<Pacientes> pacientesQueue = new LinkedList<>();
    Deque<Pacientes> pacientesDeque = new LinkedList<>();



    public void GestionarFIFO(){
        System.out.println("QUEUE DE PACIENTES");
        while(!pacientesQueue.isEmpty()){
            Pacientes pacientes1 = pacientesQueue.poll();
            System.out.println("PACIENTE ATENDIDO: " + pacientes1);
        }
        System.out.println("LISTA DE PACIENTES VACIA");

    }

    public void GestionarLIFO(){
        System.out.println("DEQUEUE DE PACIENTES");
        while(!pacientesDeque.isEmpty()){
            Pacientes pacientes1 = pacientesDeque.pop();
            System.out.println("PACIENTE ATENDIDO: " + pacientes1);
        }
        System.out.println("LISTA DE PACIENTES VACIA");

    }




    public void agregarPaciente(){
        Scanner scn = new Scanner(System.in);


        String respuesta;
        do {
            Pacientes paciente = new Pacientes();
            System.out.println("NOMBRE DE PACIENTE: ");
            String nombre = scn.nextLine();
            System.out.println("EDAD DEL PACIENTE: ");
            int edad = scn.nextInt();

            scn.nextLine();

            paciente.setNombre(nombre);
            paciente.setEdad(edad);
            paciente.setPrioridad(AsignarPrioridadPaciente());
            pacientesQueue.offer(paciente);
            pacientesDeque.push(paciente);


            System.out.println("¿Desea agregar otro paciente? (s/n)");
            respuesta = scn.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public Prioridad AsignarPrioridadPaciente(){

        Scanner scn = new Scanner(System.in);
        System.out.println("INGRESE PRIORIDAD DEL PACIENTE");
        String Prioridad1 = scn.nextLine();


        if (Prioridad1.equalsIgnoreCase("ALTA")){
            return Prioridad.ALTA;
        } else if (Prioridad1.equalsIgnoreCase("MODERADA")) {
           return Prioridad.MODERADA;

        }else {
           return Prioridad.BAJA;
        }
    }

}
