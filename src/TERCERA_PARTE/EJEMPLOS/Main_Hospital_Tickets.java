

public class MainTerceraParte {
    public static void main(String[] args) {

        GestorPacientes gestorPacientes = new GestorPacientes();
        GestorTIckets gestorTIckets = new GestorTIckets();

        gestorPacientes.agregarPaciente();
        gestorPacientes.GestionarFIFO();



        gestorTIckets.GestionarFIFO();
        gestorTIckets.GestionarLifo();

    }
}