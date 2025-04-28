package clase.vista;

import clase.impl.OperacionesImpl;
import clase.interfaz.Operaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista extends JFrame{
    private JTextField primerNumero;
    private JTextField segundoNumero;
    private JButton Sumar;
    private JButton Restar;
    private JButton Multiplicar;
    private JButton Dividir;
    private JPanel Vista;
    private JLabel Resultado;

    public Vista(){
        setTitle("Operaciones");
        setContentPane(Vista);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 500));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        Operaciones op = new OperacionesImpl();
        Sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primer = Double.parseDouble(primerNumero.getText());
                double segundo = Double.parseDouble(segundoNumero.getText());
                Resultado.setText("El resultado de la suma es: "+ op.sumar(primer,segundo));
            }
        });
        Restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primer = Double.parseDouble(primerNumero.getText());
                double segundo = Double.parseDouble(segundoNumero.getText());
                Resultado.setText("El resultado de la resta es: "+ op.restar(primer,segundo));
            }
        });
        Multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primer = Double.parseDouble(primerNumero.getText());
                double segundo = Double.parseDouble(segundoNumero.getText());
                Resultado.setText("El resultado de la multiplicación es: "+ op.multiplicar(primer,segundo));
            }
        });
        Dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primer = Double.parseDouble(primerNumero.getText());
                double segundo = Double.parseDouble(segundoNumero.getText());
                Resultado.setText("El resultado de la dividir es: "+ op.dividir(primer,segundo));
            }
        });
    }
}
