public class Nome {
    public static void main(String[] args) {
        Thread thread1 = new ThreadConNome("Rebecca");
        Thread thread2 = new ThreadConNome("Marta");

        thread1.start();
        thread2.start();
    }

    public static class ThreadConNome extends Thread {
        public ThreadConNome(String nome) {
            super(nome);
        }

        @Override
        public void run() {
            System.out.println("Ciao sono " + getName());
        }
    }
}
