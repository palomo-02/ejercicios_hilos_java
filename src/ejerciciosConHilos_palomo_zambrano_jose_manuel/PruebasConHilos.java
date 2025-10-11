package ejerciciosConHilos_palomo_zambrano_jose_manuel;

public class PruebasConHilos implements Runnable {

	private String nombre;

	public PruebasConHilos(String nombre) {

		this.nombre = nombre;

	}

	@Override
	public void run() {

		System.out.println("🟢 Iniciando hilo: " + nombre + " en " + Thread.currentThread().getName());
		System.out.println("🔴 Finaliza hilo: " + nombre);
	}

}
