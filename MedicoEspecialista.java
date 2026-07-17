package GestionHospital.Empleados;


import GestionHospital.ClasesAbstractas.PersonalMedico;

public class MedicoEspecialista extends PersonalMedico {
    private int pacientesAtendidos;
    private String registroColegio;

    public MedicoEspecialista() {
        super();
        this.pacientesAtendidos = 0;
        this.registroColegio = "";
    }

    public MedicoEspecialista(String nombre, String apellido, String fechaNacimiento, int edad, int DNI,
                              String turno, String idEmpleado, String especialidad, int anioExperiencia,
                              int pacientesAtendidos, String registroColegio) {
        super(nombre, apellido, fechaNacimiento, edad, DNI, turno, idEmpleado, especialidad, anioExperiencia);
        this.pacientesAtendidos = pacientesAtendidos;
        this.registroColegio = registroColegio;
    }

    public int getPacientesAtendidos() {
        return pacientesAtendidos;
    }
    public void setPacientesAtendidos(int pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public String getRegistroColegio() {
        return registroColegio;
    }
    public void setRegistroColegio(String registroColegio) {
        this.registroColegio = registroColegio;
    }

    public void atenderPaciente(){
        pacientesAtendidos++;
    }
    @Override
    public String datosMedico() {
        return super.datosMedico()+
                "\nRegistro Colegio: " + registroColegio +
                "\nPacientes Atendidos: " + pacientesAtendidos;
    }
}
