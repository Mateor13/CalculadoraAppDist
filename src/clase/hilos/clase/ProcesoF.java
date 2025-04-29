package clase.hilos.clase;

import javax.swing.*;
import java.awt.*;
import clase.hilos.clase.*;

public class ProcesoF implements Runnable {

    public void Automoviles(){
        AutoVentana au = new AutoVentana();
    }

    @Override
    public void run() {
        Automoviles();
    }
}
