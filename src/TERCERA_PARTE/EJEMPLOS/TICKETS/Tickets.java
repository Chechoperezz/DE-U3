import Prioridad;

public class Tickets {
    String NombreDeCliente;
    Prioridad prioridad;

    public String getNombreDeCliente() {
        return NombreDeCliente;
    }

    public void setNombreDeCliente(String nombreDeCliente) {
        NombreDeCliente = nombreDeCliente;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Tickets() {
    }

    public Tickets(String nombreDeCliente, Prioridad prioridad) {
        NombreDeCliente = nombreDeCliente;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "NombreDeCliente='" + NombreDeCliente + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}
