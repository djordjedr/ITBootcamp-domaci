package projekatZaOdmor;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna zbir prvih n prirodnih brojeva, izostavljajuci
		 * one koji su deljivi brojem k.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int n = 1;
		do {

			System.out.println("Unesite prirodan broj:");
			n = sc.nextInt();
		} while (n <= 0);

	

		int k = 1;
		do {
			System.out.println("Unesite broj k (ne sme biti 0):");
			k = sc.nextInt();
		} while (k == 0);
		

		int broj = 0;
		for (int i = 0; i <= n; i++) {

			System.out.println("i je " + i);

			 if(i % k == 0) {
				
				continue;
			}
			
			
			broj = broj + i;
			
		}
		System.out.println("Zbir iznosi " + broj);
	}

}
