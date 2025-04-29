package clase.hilos.clase;

import javax.swing.*;

public class Datos extends JFrame {

    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblPrecio;
    private JLabel txtMarca;
    private JLabel txtModelo;
    private JLabel txtPrecio;

    public Datos(Auto auto){
        setTitle("Datos del Vehículo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        lblMarca = new JLabel("Marca: ");
        lblModelo = new JLabel("Modelo: ");
        lblPrecio = new JLabel("Precio: ");
        txtMarca = new JLabel();
        txtModelo = new JLabel();
        txtPrecio = new JLabel();
        txtMarca.setBounds(70, 20, 150, 30);
        txtModelo.setBounds(70, 60, 150, 30);
        txtPrecio.setBounds(70, 100, 150, 30);
        lblMarca.setBounds(20, 20, 100, 30);
        lblModelo.setBounds(20, 60, 100, 30);
        lblPrecio.setBounds(20, 100, 100, 30);
        add(txtMarca);
        add(txtModelo);
        add(txtPrecio);
        add(lblMarca);
        add(lblModelo);
        add(lblPrecio);
        txtMarca.setText(auto.getMarca());
        txtModelo.setText(auto.getModelo());
        txtPrecio.setText(auto.getPrecio());
        setVisible(true);
    }
}
