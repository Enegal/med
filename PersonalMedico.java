package GestionHospital.ClasesAbstractas;

public abstract class PersonalMedico extends Persona {
    private String turno;
    private String IdEmpleado;
    private String especialidad;
    private int anioExperiencia;

    public PersonalMedico(){
        this.turno = "";
        this.IdEmpleado = "";
        this.especialidad = "";
        this.anioExperiencia = 0;
    }

    public PersonalMedico(String nombre, String apellido, String fechaNacimiento, int edad,
                          int DNI, String turno, String idEmpleado,
                          String especialidad, int anioExperiencia) {
        super(nombre, apellido, fechaNacimiento, edad, DNI);
        this.turno = turno;
        this.IdEmpleado = idEmpleado;
        this.especialidad = especialidad;
        this.anioExperiencia = anioExperiencia;
    }


    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }
    public void setIdEmpleado(String idEmpleado) {
        IdEmpleado = idEmpleado;
    }


    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnioExperiencia() {
        return anioExperiencia;
    }
    public void setAnioExperiencia(int  anioExperiencia) {
        if(anioExperiencia >= 0){
            this.anioExperiencia = anioExperiencia;

        }
    }

    public String datosMedico() {
        return super.mostrarDatos()+
                "\nID del empleado : " + IdEmpleado+
                "\nEspecialidad : " + especialidad+
                "\nTurno : "+ turno+
                "\nAños de experiencia : " + anioExperiencia;
    };
}
