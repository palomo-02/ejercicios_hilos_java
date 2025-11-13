package com;

public class Ejercicio4 {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {

			System.out.println("hilo: ");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		);

		System.out.println("estado antes del start" + t1.getState());

		t1.start();
		System.out.println("estado despues del start" + t1.getState());

		System.out.println("ta vivo?" + t1.isAlive());

		try {

			t1.join();

			System.out.println("tras el join " + t1.getState());

			System.out.println("ta vivo? tras el join" + t1.isAlive());

		} catch (InterruptedException e) {

			System.out.println("error :(");
		}

	}

}
