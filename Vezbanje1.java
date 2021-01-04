package userStory;


import java.text.DecimalFormat; //Import za ogranicavanje decimala
import java.math.RoundingMode; //Import zs zsokruzivanje decimala
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {
		/*
		 * 
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:

0 - Izlaz iz programa (zatvaranje kase)
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna

Ukoliko korisnik unese opciju 0 program se zavrsava.
Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna 
i da se ponovo ispise meni.
	Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
	 Zatim se ponovo ispisuje meni.



		 */
		DecimalFormat df2 = new DecimalFormat("#.##");
		Scanner sc= new Scanner(System.in);
		
		boolean meny = true;
		boolean platio=true;
		double cena=0;
		double racun=0;
		double novac=0;
		int ulaz=0;
		boolean greska=true;
		
		while(meny==true) {
			
			if (racun==0) {
				System.out.println("Vasa korpa je prazna \n");
			}
			else {
				System.out.println("Pazarili ste za :"+ df2.format(racun) + " rsd \n");
			}
			
		
		
		/*
		 * Try/catch blok koji resetuje vrednost scannera u catch-u sa sc.next da ne bi doslo do beskonacne petlje posto scanner pamti poslednji unos
		 */
		
		while(true) {
			try {
				System.out.println("izaberite jednu od opcija: \n");
				System.out.println("0 - Izlaz iz programa (zatvaranje kase)");
				System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu/resetovanje korpe)");
				System.out.println("2 - naplata racuna");
				ulaz=sc.nextInt();
				break;
				
			}
			catch (InputMismatchException ex)
			{
				System.out.println("Nepravilna vrednost");
				sc.next();
			}
		}
		
			
		
		
		
		
		
		
			
			
		
		switch(ulaz) {
		
		
			case 0:
				if(platio==false) {
					System.out.println("Ne mozete izaci iz programa dok je racun veci od 0");
					break;
				}
				System.out.println("program je zavrsen.");
				meny=false;
				break;
				
			case 1:
				
				
				while(true) {
				try {
					System.out.println("unesite cenu proizvoda (unesite 0 za resetovanje potrosacke korpe.):");
					
					cena=sc.nextDouble();
					break;
				}
				catch (InputMismatchException ex) {
					System.out.println("Nepravilna vrednost, double se unosi sa \", \" ");
					
					sc.next();
				}
				}
				
				
				if (cena<0) {
					System.out.println("nepravilan unos");
					break;
				}
				if (cena==0){
					
					racun=0;
					platio=true;
					break;
				}
				racun=racun+cena;
				if (racun>0) {
					platio=false;
				}
				
				System.out.println("Vas racun iznosi "+ df2.format(racun) + " din \n");
				//meny=true;
				break;
				
			case 2:
				
				if (racun==0) {
					System.out.println("Niste jos nista kupili! \n");
					platio=true;
					break;
					}
				
				while(true) {
					try {
						System.out.println("Unesite kolicinu novca za naplatu racuna:");
						novac=sc.nextDouble();
						break;
					}
					catch(InputMismatchException ex) {
						System.out.println("Nepravilna vrednost, double se unosi sa \", \" ");
					}
				
				}
				
				if (novac<racun) {
					System.out.println("Greska. Kolicina novca je manja od visine racuna \n ");
					
					//meny=true;
				}
				
				else {
						novac=novac-racun;
						System.out.println("Vas kusur iznosi "+ df2.format(novac) + " din\n");
						
						
						novac=0;
						racun=0;
						//meny=true;
					}
					
				break;
				
				default:
					System.out.println("Nepravilan unos \n");
		}
		}
		
		/*
		 * User Story:

Korisniku treba pri pokretanju programa staviti do znanja da koristi kasu.
Meni treba da sadrzi sledece opcije:
0 - Izlaz iz programa (zatvaranje kase)
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna


ok		Ukoliko korisnik unese opciju 0 program se zavrsava. 
ok		Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici. Zatim ispisati meni.
ok		Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna. 
ok		Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska
 (proizvoljna smislena poruka), bez umanjenja racuna i da se ponovo ispise meni. 
ok		Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo 
 postavlja na nulu. Zatim se ponovo ispisuje meni.


ok		Ako korisnik odmah unese opciju 2, nista nije dodato u potrosacku korpu, potrebno je ispisati smislenu poruku korisniku i ponovo ispisati meni.
fail	Korisnik ne moze da zavrsi koriscenje programa dokle god ima proizvode u potrosackoj korpi ili dokle god nije platio racun.
fail	Omoguciti korisniku da prilikom odabira opcije za dodavanje cene proizvoda, isprazni svoju potrosacku korpu. Racun se postavlja na nulu i ponovo se ispisuje se meni.
ok		Podrazumeva se da korisniku treba omoguciti da unosi validne vrednosti za cenu proizvoda i novca za placanje

		 */
	}

}
