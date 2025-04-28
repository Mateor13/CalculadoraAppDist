package clase.hilos.clase;

public class ProcesoD implements Runnable {
    private int numero;
    public ProcesoD(int numero){
       this.numero=100;
    }

    public void asteriscos(int numero){
        for (int i=0; i<numero; i++){
            System.out.print("*");
        }
    }
    @Override
    public void run() {
        asteriscos(numero);
    }
}
