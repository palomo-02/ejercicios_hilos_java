package com;

public class Contador {
	public static int contador = 0;

	public static void main(String[] args) {

		String name = Thread.currentThread().getName();

		System.out.println("soy: " + name);

		Thread t1 = new Thread(() -> {

			System.out.println("soy " + Thread.currentThread().getName());

			for (int i = 0; i < 1000; i++) {

				contador++;

			}
		});
		Thread t2 = new Thread(() -> {

			System.out.println("soy " + Thread.currentThread().getName());

			for (int i = 0; i < 1000; i++) {

				contador++;

			}

		});

		
		t1.start();
		t2.start();
		
		try {
			
			t1.join();
			t2.join();
			
			
		}catch(Exception e) {
			
			System.out.println("error");
			
			
		}
		System.out.println("contador: " +contador);
	}

}
