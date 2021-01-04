package projekatZaOdmor;

public class DrugiZadatak2 {

	public static void main(String[] args) {
		/*
		 * Zadatak sa tehnickog intervjua: ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene.
		 *  Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih

		 */
		
		int x=3;
		int y=7;
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x je: " + x);
		System.out.println("y je: " +y);
	}

}
