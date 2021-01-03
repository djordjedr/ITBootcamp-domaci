package projekatZaOdmor;

import java.util.Scanner;

public class CetvrtiZadatak {

	public static void main(String[] args) {
		/*
		 * Napisati program koji za tri unete ocene ispisuje srednju vrednost i u
		 * numerièkom i opisnom obliku (opisan oblik - odlican, vrlo dobar, dobar,
		 * dovoljan, nedovoljan)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		double zbir = 0;
		boolean nedovoljan = false;
		double prosek = 0;

		for (int i = 1; i <= 3; i++) {
			//while (nedovoljan == false) {				// ovde je bio cilj da iskoci iz petlje ako je uneta vrednost 1 ali to nije u opisu zadatka
				System.out.println("Unesite ocenu broj " + i);
				int ocena = sc.nextInt();
				while (ocena <= 1 || ocena > 6) {
					if (ocena == 1) {
						//System.out.println("nedovoljan");
						nedovoljan = true;
						break;
					}
					System.out.println("Ocena mora biti u rasponu od 1 do 5");
					System.out.println("Unesite " + i + ". ocenu:");
					ocena = sc.nextInt();

				}
				zbir = zbir + ocena;

			//}
		}

		prosek = zbir / 3;
		
		if (prosek < 1.4) {
			System.out.println("nedovoljan "+ prosek);
		}
		
		if (prosek >= 1.5 && prosek < 2.4) {
			System.out.println("dovoljan "+ prosek);
		}
		
		if (prosek >= 2.5 && prosek < 3.4) {
			System.out.println("dobar "+ prosek);
		}
		
		if (prosek >= 3.5 && prosek < 4.4) {
			System.out.println("vrlo dobar "+ prosek);
		}
		if (prosek >= 4.5)  {
			System.out.println("odlican "+ prosek);
		}
		

	}

}
