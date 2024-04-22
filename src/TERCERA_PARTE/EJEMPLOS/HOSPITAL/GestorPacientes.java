package TERCERA_PARTE.EJEMPLOS.HOSPITAL;
import java.util.*;


public class GestorPacientes{

    //QUEUE SOLO UTILIZA PRIORIDAD FIFO ESTRICTAMENTE.
    static Queue<Pacientes> pacientesQueue = new LinkedList<>();

    /*
    DEQUEUE ES MAS FLEXIBLE EN LA INCERSION Y MANEJO
     DE DATOS. PUEDE USAR FIFO , PERO NO SE LIMITA A
     ESTA.
     */
    static Deque<Pacientes> pacientesDeque = new LinkedList<>();

    public void GestionarFIFO(){
        System.out.println("QUEUE DE PACIENTES");
        while(!pacientesQueue.isEmpty()){
            Pacientes pacientes1 = pacientesQueue.poll();
            System.out.println("PACIENTE ATENDIDO: " + pacientes1.toString());
        }
        System.out.println("LISTA DE PACIENTES VACIA");

    }

    /* EL FACTOR PRINCIPAL EN LA GESTION DE PACIENTES
    ES LA INCERSION DE ESTOS A LA QUEUE/DEQUEUE.

    AMBOS GESTORES ITERAN DE IZQUIERDA A DERECHA.
    PERO LOS DATOS ESTAN ALMACENADOS DE FORMA DISTINTA

     */

    public void GestionarLIFO(){
        System.out.println("DEQUEUE DE PACIENTES");
        while(!pacientesDeque.isEmpty()){
            Pacientes pacientes1 = pacientesDeque.pop();
            System.out.println("PACIENTE ATENDIDO: " + pacientes1.toString());
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

            /* LA PRIORIDAD DEL PACIENTE NO TIENE INCIDENCIA
            EN LA MANERA EN QUE SE ATIENDEN.

            ES POR ELLO QUE NO SE HACEN EXCEPCIONES DE ACUERDO A SU
            CONDICION EN ESTA IMPLEMENTACION ESPECIFICAMENTE.
             */
            paciente.setPrioridad(AsignarPrioridadPaciente());


            pacientesQueue.offer(paciente); //OFFER AÑADE LOS PACIENTES AL FINAL DE LA LISTA
            pacientesDeque.push(paciente); // PUSH AÑADE LOS PACIENTES AL PRINCIPIO
             /*PUSH ES UN METODO ORIGINALMENTE DE STACKS/PILAS . PERO LA FLEXIBILIDAD DE
            DEQUEUE PERMITE HACER USO DE ESTE.
             */

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
