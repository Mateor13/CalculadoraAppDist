package clase.hilos.clase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutoVentana extends JFrame{

    private JPanel Registro;
    private JTextField inputMarca;
    private JTextField inputModelo;
    private JTextField inputPrecio;
    private JButton registrarButton;

    public AutoVentana(){
    setTitle("Registar");
    setContentPane(Registro);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(600, 500));
    setBackground(Color.red);
    pack();
    setVisible(true);
    setLocationRelativeTo(null);
    setResizable(false);
        Auto auto = new Auto();
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auto.setMarca(inputMarca.getText());
                auto.setPrecio(inputPrecio.getText());
                auto.setModelo(inputModelo.getText());
                new Datos(auto);
                dispose();
            }
        });
    }
}
