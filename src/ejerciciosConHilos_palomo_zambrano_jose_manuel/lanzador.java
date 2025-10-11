package ejerciciosConHilos_palomo_zambrano_jose_manuel;

public class lanzador {

	public static void main(String[] args)  {


		Thread h = new Thread(new PruebasConHilos("a"));

		h.start();
		
		
		try {


		
	System.out.println(h.getName() + "------->"+ h.getState());

	Thread.sleep(50);
	System.out.println(h.getName() + "------->"+ h.getState());
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
