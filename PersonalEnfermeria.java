package GestionHospital.Empleados;

import GestionHospital.ClasesAbstractas.PersonalMedico;

public class PersonalEnfermeria extends PersonalMedico {
    private String areaAsignida;

    public PersonalEnfermeria() {
        super();
        this.areaAsignida = "";
    }

    public PersonalEnfermeria(String nombre, String apellido, String fechaNacimiento,
                              int edad, int DNI, String turno, String idEmpleado,
                              String especialidad, int anioExperiencia, String areaAsignida) {
        super(nombre, apellido, fechaNacimiento, edad, DNI, turno, idEmpleado, especialidad, anioExperiencia);
        this.areaAsignida = areaAsignida;
    }

    public String getAreaAsignida() {
        return areaAsignida;
    }
    public void setAreaAsignida(String areaAsignida) {
        this.areaAsignida = areaAsignida;
    }

    public void registrarPaciente() {
        System.out.println("Paciente registrado correctamente");
    }
    public void actualizarSignosPaciente() {
        System.out.println("Signos vitales actualizados correctamente");
    }

    @Override
    public String datosMedico() {
        return super.datosMedico() +
                "\nÁrea Asignada: " + areaAsignida;
    }
}
