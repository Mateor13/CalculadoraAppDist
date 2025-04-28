package clase.hilos.clase;

import javax.swing.*;

public class ProcesoE implements Runnable{

    public ProcesoE(){
    }
    public void Dialogo(){
        String[] opciones = {"Obvio microbio", "Nel Pastel", "Cancelar"};
        JOptionPane.showOptionDialog(null,"Hola, ¿Cómo estás?", "Saludos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
    }
    @Override
    public void run() {
        Dialogo();
    }
}
