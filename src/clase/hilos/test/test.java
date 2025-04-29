package clase.hilos.test;

import clase.hilos.clase.*;

public class test {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Juan");
        p.setFechaNacimiento("01/10/2004");
        p.setDireccion("La Prensa");

        System.out.println("Nombre: "+ p.getNombre());
        System.out.println("Fecha de Nacimiento: "+ p.getFechaNacimiento());
        System.out.println("Dirección: "+ p.getDireccion());
        ProcesoA a = new ProcesoA("Juan");
        ProcesoB b = new ProcesoB(10);
        ProcesoC c = new ProcesoC(5);
        Runnable x = new ProcesoD(0);
        Runnable y = new ProcesoE();
        Runnable f = new ProcesoF();
        Thread a1 = new Thread(f);
        Thread q = new Thread(y);
        Thread d = new Thread(x);
        c.start();
        a.start();
        b.start();
        d.start();
        q.start();
        a1.start();
    }
}
