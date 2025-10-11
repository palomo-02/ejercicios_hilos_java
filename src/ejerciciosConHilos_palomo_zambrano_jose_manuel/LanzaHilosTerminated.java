package ejerciciosConHilos_palomo_zambrano_jose_manuel;

public class LanzaHilosTerminated {

		public static void main(String[] args) throws InterruptedException {
			Thread t = new Thread(new PruebasConHilos("finalizado"));
			t.start();
			t.join();
			System.out.println(t.getName() + " -> " + t.getState());
		}
	}
