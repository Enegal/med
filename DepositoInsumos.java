package GestionHospital.ClaseGenerica;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class DepositoInsumos <T> {
    T objeto;

    public DepositoInsumos(T objeto) {
        this.objeto = objeto;
    }
    public void Tipy() {
        System.out.println(this.objeto + "el tipo es : " + objeto.getClass().getName());
    }

}
