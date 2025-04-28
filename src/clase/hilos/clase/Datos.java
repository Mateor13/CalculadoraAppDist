package clase.hilos.clase;

import javax.swing.*;
import java.awt.*;

public class Datos extends JFrame {

    private JPanel Datos;
    private JLabel txtMarca;
    private JLabel txtModelo;
    private JLabel txtPrecio;

    public Datos(Auto auto){
        setTitle("Datos del Vehículo");
        setContentPane(Datos);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 500));
        setBackground(Color.red);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        txtMarca.setText(auto.getMarca());
        txtModelo.setText(auto.getModelo());
        txtPrecio.setText(auto.getPrecio());
    }
}
