package projekatZaOdmor;

import java.util.Scanner;

public class DevetiZadatak {

	public static void main(String[] args) {
		/*
		 * Neobavezan zadatak, vrlo pozeljno da se uradi: Na sahovskoj tabli je red obelezen sa 1 2 3 4 5 6 7 8 i kolona sa 1 2 3 4 5 6 7 8. 
Tabla je obelezena ovako:

1 2 3 4 5 6 7 8 
2
3
4
5
6
7
8

Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni skakac sa vrha. Korisnik prvo unosi pozicije piona kao dva cela broja, a zatim poziciju skakaca,
 gde prvi broj predstavlja red, a drugi kolonu. Program treba da ispise da li se figure nalaze u poziciji da je skakac napadnut.
Primeri: 6 4 7 4 ---> nije napadnut
              6 4 5 5 ---> jeste napadnut 
              2 2 1 1 ---> jeste napadnut
              9 1 6 8 ---> greska u unosu


		 */
		boolean red=false;
		boolean kolona=false;
		//boolean greska=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite poziciju belog piuna:");
		
		int redPiun=sc.nextInt();
		
		System.out.println("Unesite kolonu u kojoj se nalazi beli piun:");
		
		int kolonaPiun=sc.nextInt();
		
		System.out.println("Unesite poziciju crnog skakaca:");
		
		int redSkakac=sc.nextInt();
		
		System.out.println("Unesite kolonu u kojoj se nalazi crni skakac");
				
		int kolonaSkakac=sc.nextInt();
		
		if (redPiun<1 || redPiun>8 || redSkakac<1 || redSkakac>8 || kolonaPiun<1 || kolonaPiun>8 || kolonaSkakac<1 || kolonaSkakac>8 ) {
			System.out.println("Greska u unosu");
			return;
			//greska=true;
		}
		
		// piun napada  samo jedno polje po dijagonali od njega, znaci red +1, kolona +1, -1 od postojece
		
		if (redSkakac==(redPiun-1)) {
			red=true;
			System.out.println("Red je true");
		}
		
		if (kolonaSkakac==(kolonaPiun+1) || kolonaSkakac==(kolonaPiun-1)) {
			kolona=true;
			System.out.println("kolona je true");
		}
		
		if(kolona==true && red==true ) {
			System.out.println("jeste napadnut");
		}
		else {
			System.out.println("Nije napadnut");
		}
	}

}
