package com;

public class Ejercicio7 {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {

			int contador = 0;

			while (!Thread.currentThread().isInterrupted()) {

				contador++;
				System.out.println("contador" + contador);
				try {
					Thread.sleep(500);

				} catch (InterruptedException e) {

					System.out.println("el hilo ha sido interrrumpido ");

				}

			}
			System.out.println("el hilo ha finalizado");
		});
		t1.start();
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		t1.interrupt();

	}

}
