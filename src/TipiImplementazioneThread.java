public class TipiImplementazioneThread {
    public static void main(String[] args) {

        Thread customThread = new CustomThread();

        Thread customRunnable = new Thread(new CustomRunnable());

        Thread threadConClasseAnonima = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread con classe anonima");
            }
        });

        Thread threadConLambda = new Thread(() -> System.out.println("Thread con lambda"));


        customThread.start();
        customRunnable.start();
        threadConClasseAnonima.start();
        threadConLambda.start();
    }

    static class CustomThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread con estensione della classe Thread");
        }
    }

    static class CustomRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread con implementazione dell'interfaccia Runnable");
        }
    }
}
