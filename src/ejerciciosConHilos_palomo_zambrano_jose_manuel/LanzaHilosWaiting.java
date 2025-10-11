package ejerciciosConHilos_palomo_zambrano_jose_manuel;

public class LanzaHilosWaiting {
    private static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK) {
                try { 
                	System.out.println(Thread.currentThread().getName()+"esperand...");
                	LOCK.wait();
                } catch (InterruptedException ignored) {}
            }
        }, "twaiting");



        t1.start();
        Thread.sleep(100);
        System.out.println(t1.getName() + " -> " + t1.getState());
    }
}