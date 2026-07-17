package ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmAdmision {
    private JPanel panelAdmision;
    private JTextField txtNombrePaciente;
    private JTextField txtDNI;
    private JTextArea txtSintomas;
    private JTextField txtSignosVitales;
    private JComboBox<String> cbNivelUrgencia; // Llenar con Niveles 1 al 5
    private JButton btnRegistrarPaciente;
    private JButton btnActualizarEstado;
    private JTable tbColaEspera; // Muestra la PriorityQueue

    public FrmAdmision() {
        btnRegistrarPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getPanelAdmision() {
        return panelAdmision;
    }
}