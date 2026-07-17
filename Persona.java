package GestionHospital.ClasesAbstractas;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int edad;
    private int DNI;


    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.fechaNacimiento = "";
        this.edad = 0;
        this.DNI = 0;
    }

    public Persona(String nombre, String apellido, String fechaNacimiento, int edad, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad < 0) {
            this.edad = edad;
        }
    }

    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        if (DNI < 0) {
            this.DNI = DNI;
        }
    }

    public String mostrarDatos() {
        return "\nNombre : " +getNombre()+
                "\nApellido : " +getApellido()+
                "\nDNI : " + getDNI()+
                "\nEdad : " + getEdad()+
        "\nFecha de Nacimiento : " + getFechaNacimiento();
    }
}



