package GestionHospital.Servicio;

import GestionHospital.ClasesAbstractas.Atencion;
import GestionHospital.PacientePackage.Paciente;

import java.lang.ref.PhantomReference;

public class AtencionEmergencia extends Atencion {
   private int nivelTriaje;
   private String diagnostico;
   private boolean hospitalizado;

   public AtencionEmergencia(){
       super();
       this.nivelTriaje=5;
       this.diagnostico="";
       this.hospitalizado=false;
   }

   public AtencionEmergencia(int nivelTriaje,String idAtencion, String tipo,
                             String prioridad,String estado, Paciente paciente, String diagnostico, boolean hospitalizado){
       super(idAtencion,tipo,prioridad,estado,paciente);
       this.nivelTriaje = nivelTriaje;
       this.diagnostico= diagnostico;
       this.hospitalizado= hospitalizado;
   }

   public int getNivelTriaje() {
       return nivelTriaje;
   }
    public void setNivelTriage(int nivelTriage){
       if(nivelTriage>=1 && nivelTriage<=5){
           this.nivelTriaje=nivelTriage;
       }
   }

   @Override
    public int calculoPrioridadAtencion() {
        return nivelTriaje;
    }
    @Override
    public String datosAtencion(){
       return  super.datosAtencion()+
               "\nNivel de triaje : " + nivelTriaje+
               "\nDiagnostico : " + diagnostico+
               "\nHospitalizado : " + hospitalizado;
    }
}
