package GestionHospital.ClasesAbstractas;

import GestionHospital.PacientePackage.Paciente;

public abstract class Atencion {
    private String idAtencion;
    private String tipo;
    private String prioridad;
    private String estado;
    private Paciente paciente;

    public Atencion() {
        this.idAtencion = "";
        this.tipo = "";
        this.prioridad = "";
        this.estado = "";
        this.paciente = null;

    }

    public Atencion(String idAtencion, String tipo,
                    String prioridad, String estado,
                    Paciente paciente) {
        this.idAtencion = idAtencion;
        this.tipo = tipo;
        this.prioridad = prioridad;
        this.estado = estado;
        this.paciente = paciente;
    }

    public String getIdAtencion() {
        return idAtencion;
    }
    public void setIdAtencion(String idAtencion) {
        this.idAtencion = idAtencion;

    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public abstract int calculoPrioridadAtencion();

    public String datosAtencion() {
        return "ID Atención: " + idAtencion +
                "\nTipo: " + tipo +
                "\nPrioridad: " + prioridad +
                "\nEstado: " + estado +
                "\nPaciente: " + paciente.getNombre() + " " + paciente.getApellido();

    }

}