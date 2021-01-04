package projekatZaOdmor;

import java.util.Scanner;

public class DesetiZadatak {

	public static void main(String[] args) {
		/*
		 * Neobavezan zadatak, vrlo pozeljno da se uradi: Na sahovskoj tabli je red obelezen sa 1 2 3 4 5 6 7 8 i kolona sa 1 2 3 4 5 6 7 8. 
Tabla je obelezena ovako:
 k k k k k k k k 
r 1 2 3 4 5 6 7 8 
r 2 p
r 3    p
r 4 s
r 5    p
r 6p  p
r 7
r 8

Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni skakac sa vrha. Korisnik prvo unosi pozicije piona kao dva cela broja, a zatim poziciju skakaca,
 gde prvi broj predstavlja red, a drugi kolonu. Program treba da ispise da li se figure nalaze u poziciji da je skakac napadnut.
Primeri: 6 4 7 4 ---> nije napadnut
              6 4 5 5 ---> jeste napadnut 
              2 2 1 1 ---> jeste napadnut
              9 1 6 8 ---> greska u unosu
Zadatak uraditi obrnuto, tj proveriti jel piun napadnut

		 */
		
		boolean red=false;
		boolean kolona=false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite red belog piuna:");
		
		int redPiun=sc.nextInt();
		
		System.out.println("Unesite kolonu u kojoj se nalazi beli piun:");
		
		int kolonaPiun=sc.nextInt();
		
		System.out.println("Unesite red crnog skakaca:");
		
		int redSkakac=sc.nextInt();
		
		System.out.println("Unesite kolonu u kojoj se nalazi crni skakac");
				
		int kolonaSkakac=sc.nextInt();
		
		if (redPiun<1 || redPiun>8 || redSkakac<1 || redSkakac>8 || kolonaPiun<1 || kolonaPiun>8 || kolonaSkakac<1 || kolonaSkakac>8 ) {
			System.out.println("Greska u unosu");
			return;
		}
		// skakac napada na sve cetri strane po dva polja i onda polje pored
			
			
		if(redPiun==(redSkakac+2) || redPiun==(redSkakac-2)|| redPiun==(redSkakac-1) ||redPiun==(redSkakac+1)) {
			red=true;
			//System.out.println("red je true");
		}
		if (kolonaPiun==(kolonaSkakac+2) || kolonaPiun==(kolonaSkakac-2) || kolonaPiun==(kolonaSkakac+1) || kolonaPiun==(kolonaSkakac-1) ) {
			kolona=true;
			//System.out.println("kolona je true");
		}
		
		if(red==true && kolona==true) {
			System.out.println("piun je napadnut");
		}
		else {
			System.out.println("piun nije napadnut");
		}

	}

}
