package ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmAnalitica {
    private JPanel panelAnalitica;
    private JLabel lblTotalAtenciones;
    private JLabel lblTiempoPromedio;
    private JTextArea txtReporteEspecialidad;
    private JTable tbCargaLaboralMedicos;
    private JButton btnActualizarEstadisticas;

    public FrmAnalitica() {
        btnActualizarEstadisticas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getPanelAnalitica() {
        return panelAnalitica;
    }
}