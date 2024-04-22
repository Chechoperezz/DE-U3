package TERCERA_PARTE.EJEMPLOS.CALLCENTER;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;
import java.util.Stack;

public class GestorDeLlamadas {
    Stack<Llamada> llamadas = new Stack<>(); //EL STACK SIGUE ESTRICTAMENTE EL PRINCIPIO LIFO

   // LAS LLAMADAS MAS RECIENTES SE ATIENDEN PRIMERO
    public void  GestionarLlamadas(){
        System.out.println("STACK DE PACIENTES");
        while(!llamadas.isEmpty()){
            Llamada llamada = llamadas.pop();
            System.out.println("LLAMADA ATENDIDA: " + llamada.toString());
        }
        System.out.println("LISTA DE LLAMADAS VACIA");

    }

    /*
    LAS LLAMADAS SE INSERTAN/REGISTRAN SIGUIENDO
    EL PRICNIPIO LIFO.

    SE DEBE SER CONSISTENTE CON LOS PRINCIPIOS
    DE LA PILA/STACK.
     */
    public void agregarLLamada(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("NOMBRE DE CLIENTE");
        String nombre = scanner.nextLine();
        System.out.println("APELLIDO DE CLIENTE");
        String apellido = scanner.nextLine();
        System.out.println("MOTIVO DE LLAMADA");
        String motivo =scanner.nextLine();

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        Llamada llamada = new Llamada();
        llamada.setCliente(cliente);

        //EL MOTIVO DE LLAMADA NO PROVOCA UN EXCEPCION EN LA INCERSION Y MANEJO DE DATOS.
        llamada.setMotivo(MotivoDeLlamada(motivo));

        llamadas.push(llamada);

    }

    public Motivo MotivoDeLlamada(@NotNull String motivo) {
        if (motivo.equalsIgnoreCase("Consulta")) {
            return Motivo.CONSULTA;
        } else if (motivo.equalsIgnoreCase("Queja")) {
            return Motivo.QUEJA;
        } else if (motivo.equalsIgnoreCase("Peticion")) {
            return Motivo.PETICION;
        }else {
            throw new RuntimeException("MOTIVO INVALIDO");
        }
    }
}
