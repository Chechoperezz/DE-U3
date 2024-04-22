public class Pacientes {

    String Nombre;
    int Edad;

    Prioridad prioridad;

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Pacientes() {
    }

    public Pacientes(String nombre, int edad, Prioridad prioridad) {
        Nombre = nombre;
        Edad = edad;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", prioridad=" + prioridad +
                '}';
    }
}
