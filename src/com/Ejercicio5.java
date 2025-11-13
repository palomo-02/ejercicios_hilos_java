package com;

public class Ejercicio5 {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {

			for (int i = 0; i < 10; i++) {

				System.out.println("hola, soy el thread 1");
			}

		});

		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 10; i++) {

				System.out.println("hola, soy el thread 2");
			}

		});

		t1.start();

		try {
			t1.join();
			t2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
