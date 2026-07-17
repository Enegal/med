package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipal {
    private JPanel panelPrincipal;
    private JButton btnAdmisionTriage;
    private JButton btnAsignacionTurnos;
    private JButton btnControlInsumos;
    private JButton btnAnalitica;

    public FrmPrincipal() {

        btnAdmisionTriage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Admisión y Triage - UTP Med");
                frame.setContentPane(new FrmAdmision().getPanelAdmision());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
                frame.setVisible(true);
            }
        });


        btnAsignacionTurnos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Asignación y Turnos - UTP Med");
                frame.setContentPane(new FrmAsignacion().getPanelAsignacion());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });


        btnControlInsumos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Control de Insumos Críticos - UTP Med");
                frame.setContentPane(new FrmInsumos().getPanelInsumos());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });


        btnAnalitica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Analítica y Cierre de Turno - UTP Med");
                frame.setContentPane(new FrmAnalitica().getPanelAnalitica());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("UTP Med - Menú Principal");
        frame.setContentPane(new FrmPrincipal().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Al cerrar este menú, termina el programa
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}