package com;

public class Ejercicio6 {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		t1.start();
		try {
			t1.join(1000);

			if (t1.isAlive()) {

				System.out.println("ta vivo");

			} else {

				System.out.println("Terminó");
			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
