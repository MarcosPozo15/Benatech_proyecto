public class Incidencia {
    // Atributos
    private int id;
    private String descripcion;
    private String prioridad;
    private String estado;
    private String cliente;

    // Constructor
    public Incidencia(int id, String descripcion, String prioridad, String cliente) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.cliente = cliente;
        this.estado = "Abierta";
    }

    // Método implementado: cambiar prioridad
    public String cambiarPrioridad(String nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
        return "Prioridad actualizada a " + nuevaPrioridad;
    }

    // Getters para prueba
    public String getPrioridad() {
        return prioridad;
    }
}
