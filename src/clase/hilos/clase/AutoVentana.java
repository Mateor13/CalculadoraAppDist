package clase.hilos.clase;

import javax.swing.*;

public class AutoVentana extends JFrame{
    private JTextField inputMarca;
    private JTextField inputModelo;
    private JTextField inputPrecio;
    private JButton registrarButton;
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblPrecio;

    public AutoVentana(){
    setTitle("Registar");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 250);
    setLocationRelativeTo(null);
    setResizable(false);
    Auto auto = new Auto();

    inputMarca = new JTextField();
    inputModelo = new JTextField();
    inputPrecio = new JTextField();
    registrarButton = new JButton("Registrar");
    lblMarca = new JLabel("Marca: ");
    lblModelo = new JLabel("Modelo: ");
    lblPrecio = new JLabel("Precio: ");
    inputMarca.setBounds(70, 20, 150, 30);
    inputModelo.setBounds(70, 60, 150, 30);
    inputPrecio.setBounds(70, 100, 150, 30);
    registrarButton.setBounds(70, 140, 150, 30);
    lblMarca.setBounds(20, 20, 100, 30);
    lblModelo.setBounds(20, 60, 100, 30);
    lblPrecio.setBounds(20, 100, 100, 30);
    add(inputMarca);
    add(inputModelo);
    add(inputPrecio);
    add(registrarButton);
    add(lblMarca);
    add(lblModelo);
    add(lblPrecio);
    registrarButton.addActionListener(e -> {
        auto.setMarca(inputMarca.getText());
        auto.setPrecio(inputPrecio.getText());
        auto.setModelo(inputModelo.getText());
        new Datos(auto);
        dispose();
        });
    setVisible(true);
    }
}
