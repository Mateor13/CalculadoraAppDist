package clase.hilos.clase;

public class ProcesoB extends Thread {
    private int n;
    //Constructor
    public ProcesoB(int n){
        this.n=n;
    }

    public void contar(int n){
        for (int i=1; i<n; i++ ){
            System.out.println("Iteración N°: "+i);
        }
    }

    @Override
    public void run() {
        try{
            sleep(2000);
            contar(n);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
