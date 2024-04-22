package TERCERA_PARTE.EJEMPLOS.CALLCENTER;

public class Llamada {

    Cliente cliente;
    Motivo motivo;

    public Llamada(Cliente cliente, Motivo motivo) {
        this.cliente = cliente;
        this.motivo = motivo;
    }

    public Llamada() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }
}
