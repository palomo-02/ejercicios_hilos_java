package com;

public class Ejercicio6 {

	public static void main(String[] args) {


	Thread t1 = new Thread(()->{
		
		try {
	Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	});
		t1.start();
		try {
			t1.join();
			
			System.out.println("ta vivo?" +t1.isAlive());
			
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		
		
	}

}
