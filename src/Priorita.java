public class Priorita {
    public static void main(String[] args) {
        Thread thread1 = new ThreadConPriorita("Alta", Thread.MAX_PRIORITY);

        Thread thread2 = new ThreadConPriorita("Media", Thread.NORM_PRIORITY);

        Thread thread3 = new ThreadConPriorita("Bassa", Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static class ThreadConPriorita extends Thread {
        public ThreadConPriorita(String nome, int priorita) {
            super(nome);
            setPriority(priorita);
        }

        @Override
        public void run() {
            System.out.println("Ciao sono " + getName() + " e la mia priorità è " + getPriority());
        }
    }
}