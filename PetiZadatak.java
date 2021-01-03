package projekatZaOdmor;

import java.util.Scanner;

public class PetiZadatak {

	public static void main(String[] args) {
		/*
		 * Cest zadatak na intervjuu: Napisati program gde korisnik unosi n brojeva i ispisuje maksimalni i minimalni broj.

		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete? ");
		int n=sc.nextInt();
		int memorija=0;
		int max=0;
		
		int min=0;
		
		for (int i=1; i<=n; i++) {
			System.out.println("Unesite " + i + ". broj");
			int broj=sc.nextInt();
			memorija=memorija+broj;
			if (i==1) {
				 max=broj;
				 min=broj;
			}
			
			
			if (broj>max) {
				max=broj;
				//System.out.println("Maksimum je " + max);
				
			}
			
			if (broj<min) {
				min=broj;
				//System.out.println("Minimum je " + min);
			}
			
			
		}
		System.out.println("Maksimum je " + max);
		System.out.println("Minimum je " + min);
		
	}

}
