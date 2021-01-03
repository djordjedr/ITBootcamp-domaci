package projekatZaOdmor;

import java.util.Scanner;

public class SestiZadatak {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
Primer niza: 32 54 123 18
Ispis: 18 123 54 32

		 */

		
	/*	
	 * 
		int [] a= {1,55,9675,-54,0 };
		
		System.out.println("Duzina niza je " + a.length);
		
		for (int i=(a.length-1); i>=0 ;i--) {
			//for (int i=0; i<a.length;i++) {
			
				System.out.print(a[i] + " ");
		}
		*/
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");
		
		int duzina=sc.nextInt();
		
		int [] niz= new int [duzina];
		
		for (int i=0; i<duzina; i++) {
			System.out.println("Unesite " + (i+1) + ". vrednost niza");
			niz [i]=sc.nextInt();
		}
		
		System.out.println("Duzina niza je "+ duzina);
		
		for (int i=duzina-1; i>=0; i-- ) {
			System.out.println(i+1 + ". vrednost niza je " + niz[i]);
		}
		
	}

}
