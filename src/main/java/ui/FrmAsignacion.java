package ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmAsignacion {
    private JPanel panelAsignacion;
    private JComboBox<String> cbEspecialidad;
    private JTable tbPersonalEnTurno;
    private JButton btnLlamarSiguientePaciente;
    private JButton btnRegistrarDiagnostico;
    private JButton btnDarAlta;

    public FrmAsignacion() {
        btnLlamarSiguientePaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public JPanel getPanelAsignacion() {
        return panelAsignacion;
    }
}