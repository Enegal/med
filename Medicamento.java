package GestionHospital.MedicamentoPackage;

public class Medicamento {
    private int stockActual;
    private int stockMaximo;
    private String codigo;
    private String nombre;
    private String lote;
    private String fechaVencimiento;

    public Medicamento() {
        this.codigo = "";
        this.nombre = "";
        this.stockActual = 0;
        this.stockMaximo = 0;
        this.lote = "";
        this.fechaVencimiento = "";
    }

    public Medicamento(int stockActual, int stockMaximo, String codigo,
                       String nombre, String lote, String fechaVencimiento) {
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.lote = lote;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getStockActual() {
        return stockActual;
    }
    public void setStockActual(int stockActual) {
        if(stockActual >= 0){
            this.stockActual = stockActual;
        }
    }

    public int getStockMaximo() {
        return stockMaximo;
    }
    public void setStockMaximo(int stockMaximo) {
        if(stockMaximo >=0 ){
            this.stockMaximo = stockMaximo;
        }
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLote() {
        return lote;
    }
    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void consumir(int cantidad){
        if(cantidad>0 && stockActual>=cantidad){
            stockActual-= cantidad;
        }
    }

    public void reponer(int cantidad){
     if(cantidad > 0) {
         stockActual += cantidad;
     }
    }
}
