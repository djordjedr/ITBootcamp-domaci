package projekatZaOdmor;

import java.util.Scanner;

public class SedmiZadatak {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5054 Ispis: Niz je rastuci.
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		int duzina=0;
		do {
		System.out.println("Unesi duzinu niza: ");
			
		 duzina = sc.nextInt();
		 if (duzina<=0) {
				System.out.println("Duzina mora biti veca od nule!");
			}
		}
		while(duzina<=0);
		
		int[] niz = new int[duzina];
		
	
		
		// System.out.println("Duzina niza je: " + duzina);
		// int max=0;
		boolean veci = true;
		boolean manji = true;
		int max = 0;
		int min = 0;

		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			niz[i] = sc.nextInt();

			if (i == 0) {
				max = niz[i];
				min = niz[i];
			}

			if (niz[i] < max) {
				veci = false;

			}
			else {
				max=niz[i];
			}
			if (niz[i] > min) {
				manji = false;

			}
			else {
				min=niz[i];
			}
			
		}

		if (duzina != 1) {
			if (veci == true) {
				System.out.println("niz je rastuci");
			}

			if (manji == true) {
				System.out.println("niz nije rastuci");
			}
		}
	}

}
