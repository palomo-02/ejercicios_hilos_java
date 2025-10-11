package ejerciciosConHilos_palomo_zambrano_jose_manuel;

public class lanzador {

	public static void main(String[] args) {


		Thread h = new Thread(new PruebasConHilos("nuevo"));
		
		
		System.out.println(h.getName() + "------->"+ h.getState());
		
	}

}
