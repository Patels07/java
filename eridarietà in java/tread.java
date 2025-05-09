
class Saluto extends Thread {
    public Saluto(String nome) {
        super(nome); 
    }

    @Override
    public void run() {
        System.out.println("Thread che saluta. Creato come estensione della classe Thread");
    }
}

 class mioSaluto implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread eseguito tramite runnable");
    }
}

public class tread {
    public static void main(String[] args) {
      
        Saluto t1 = new Saluto("ThreadSaluto");
        t1.start();

        mioSaluto salutoRunnable = new mioSaluto();
        Thread t2 = new Thread(salutoRunnable);
        t2.start();

           Thread t3 = new Thread(() -> {
            System.out.println("Sto usando una lamda expression");
        });
        
        t3.start();
    }

}
