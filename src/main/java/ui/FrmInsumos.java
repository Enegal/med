package ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInsumos {
    private JPanel panelInsumos;
    private JTable tbInventario;
    private JTextField txtNombreInsumo;
    private JTextField txtCantidadIngreso;
    private JComboBox<String> cbTipoInsumo; // Medicamento, EquipamientoMedico
    private JButton btnRegistrarIngreso;
    private JButton btnGenerarAlertaStock; // Usa Lambdas para filtrar < 15%
    private JLabel lblEstadoCamasUCI;

    public FrmInsumos() {
        btnGenerarAlertaStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public JPanel getPanelInsumos() {
        return panelInsumos;
    }
}