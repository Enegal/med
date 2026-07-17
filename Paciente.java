package GestionHospital.PacientePackage;

import GestionHospital.ClasesAbstractas.Persona;

public class Paciente extends Persona {
    private String sintomas;
    private String presionArterial;
    private String frecuenciaCardiaca;
    private String saturacionOxigeno;
    private String nivelTriage;
    private String estado;

    public Paciente (){
        super();
        this.sintomas = "";
        this.presionArterial = "";
        this.frecuenciaCardiaca = "";
        this.saturacionOxigeno = "";
        this.nivelTriage = "";
        this.estado = "";
    }

    public Paciente(String sintomas, String presionArterial, String frecuenciaCardiaca,
                    String saturacionOxigeno, String nivelTriage, String estado,
                    String nombre, String apellido, String fechaNacimiento, int edad, int DNI) {
        super(nombre, apellido, fechaNacimiento, edad, DNI);
        this.sintomas = sintomas;
        this.presionArterial = presionArterial;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.saturacionOxigeno = saturacionOxigeno;
        this.nivelTriage = nivelTriage;
        this.estado = estado;
    }

    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getPresionArterial() {
        return presionArterial;
    }
    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public String getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }
    public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public String getSaturacionOxigeno() {
        return saturacionOxigeno;
    }
    public void setSaturacionOxigeno(String saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public String getNivelTriage() {
        return nivelTriage;
    }
    public void setNivelTriage(String nivelTriage) {
        this.nivelTriage = nivelTriage;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos()+
                "\nSíntomas : " + sintomas+
                "\nPresión Arterial : " + presionArterial+
                "\nFrecuencia Cardiaca : "+ frecuenciaCardiaca+
                "\nSaturación de Oxígeno : " + saturacionOxigeno+
                "\nNivel de Triage : " + nivelTriage+
                "\nEstado : " + estado;
    }
}
