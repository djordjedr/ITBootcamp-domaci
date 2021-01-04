import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException; // Import the IOException class to handle errors
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate; // Import the LocalDateTime class
import java.time.Period;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.text.SimpleDateFormat; // string to date
import java.util.Date;
import java.util.Objects; // string to date

public class prikaziRadnike {

	static File proba2 = new File("proba2.txt"); // Specify the filename for proba2 ing
	static File privremeni = new File("privremeni.txt");  // Privremeni fajl za save

	radnik radnik1 = new radnik();

	public static void main(String[] args) throws Exception {

		// LocalDateTime sadasnjiDatum = LocalDateTime.now(); //Sadasnji datum

		int restDays = 20;
		// int jmbgDuzina = jmbg.length();

		// radnik1.jmbg= "2808987710025";
		// radnik1.firstName = "Djordje";
		Scanner x;

		while (true) {

			System.out.println("=========SISTEM ZA UPRAVLJANJE RADNICIMA=========");

			System.out.println("\n1. Prikazi radnike");

			System.out.println("2. Dodaj novog radnika");

			System.out.println("3. Obrisi radnika");

			System.out.println("4. izmeni radniku broj dana");

			System.out.println("\n Izaberite opciju (1-4)");

			Scanner input = new Scanner(System.in);
			int broj = input.nextInt();

			prikaziRadnike radnik1 = new prikaziRadnike();

			LocalDate sadasnjiDatum = LocalDate.now(); // Sadasnji datum

			Class<radnik> id = radnik.class; // proba uvoza klasa

			// int opcije=4; // Switch
			// opcije=input;

			switch (broj) {

			case 1:
				
								
				try {
					// File proba2 = new File("proba2.txt");
					Scanner citac = new Scanner(proba2);
					while (citac.hasNextLine()) {
						String data = citac.nextLine();
						System.out.println(data );

					}
					citac.close();
				} catch (FileNotFoundException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}

				break;

			case 2:

				System.out.println("Unesi podatke o novom radniku:");
				// int id=input.nextInt();

				try {
					// proba2.write(s.getBytes(), StandardOpenOption.APPEND);

					FileWriter proba2 = new FileWriter("proba2.txt", true); // true je da cuva i sledeci unos

					// PrintStream fileStream = new PrintStream(new File("proba2.txt",true)); //nova
					// linija ?
					// samo oznacava novi slog

					System.out.println("Unesi ID radnika: ");
					int radnikId = input.nextInt();
					
					proba2.write("\n" + radnikId);

					radnik1.setId(radnikId);

					// proba2.newLine();

					System.out.println(); // NE RADI i ako je obrisem onda sledeca linija koda ne radi
					proba2.write(input.nextLine());

					System.out.println("Unesi ime radnika: ");
					String radnikFirstName = input.nextLine();
					proba2.write("," + radnikFirstName);
					radnik1.setFirstName(radnikFirstName);

					// System.getProperty("line.separator"); NE RADI
					// String.format("%n");

					// Prezime

					System.out.println("Unesi prezime radnika: ");
					String radnikLastName = input.nextLine();
					proba2.write("," + radnikLastName);
					radnik1.setLastName(radnikLastName);

					// jmbg

					// if (input.nextLine().length() !=13) {
					
					
					System.out.println("Unesi jmbg radnika: ");

					String radnikjmbg = input.nextLine();
					
				/*
					Double d =Double.parseDouble(radnikjmbg);				
					boolean val = (d != 0);						// double to boolean!!!
					
					while(val==false ) {
					
					System.out.println(radnikjmbg + " Unesite validan jmbg:");
					radnikjmbg=input.nextLine();
					}
					
					*/
					
					while (true) {																	// Moze i ovako, try, catch in while loop
					 try { // checking valid Double using parseDouble() method 						///////Ovo radi////////
					  Double.parseDouble(radnikjmbg); 
					  break;}
					 
					  catch (NumberFormatException e) {
						  
					  System.out.println(" Unesite validan jmbg:");
					  radnikjmbg=input.nextLine(); 
					  }
					}
					
					
					while (radnikjmbg.length() != 13) {
						System.out.println("Neodgovaraca duzina jmbg-a");			 // Aleluja!!!
						radnikjmbg = input.nextLine();
					}
					

					proba2.write("," + radnikjmbg);
					radnik1.setJmbg(radnikjmbg);
					// }

					/*
					 * try { while( jmbg.length() != 13);
					 * 
					 * } catch (Exception e){ System.out.println("Neodgovarajuci jmbg");
					 * 
					 * }; if (radnikjmbg.length() !=13) {
					 * System.out.println("Neodgovarajuca duzina jmbg-a"); // String radnikjmbg=
					 * input.nextLine(); }
					 */

					System.out.println("unesi datum rodjenja u formatu dd/MM/yyyy : ");
					String radnikDateOfBirth = input.nextLine();
					proba2.write("," + radnikDateOfBirth);
					radnik1.setDateOfBirth(radnikDateOfBirth);
					
			
					
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					sdf.setLenient(false);
					/////////////////////////////////////////////
					//Date d1 = sdf.parse(radnikDateOfBirth);					//prebacuje string u date
					//String value = "true";
					//boolean b = Boolean.parseBoolean(value);					//prebacuje string u boolean
					//////////////////////////////////////////////
					
					
					 while(true) {
							try {
							Date d1 = sdf.parse(radnikDateOfBirth);						//Radi unos DATUM-a u while loop
							
							break;
							} catch (Exception e) {
							System.out.println("Neispravan unos");
							radnikDateOfBirth = input.nextLine();
							}
							
						}
					 
					 	LocalDate currentDate = LocalDate.now();

				        LocalDate sixMonthsAgo = LocalDate.now().plusMonths(-6);  // 6 months ago

				        System.out.println(currentDate);                          // 2020-02-24
				        System.out.println(sixMonthsAgo);                         // 2019-08-24
				        /////////////////////////////////////////
				       
				        LocalDate newDate = LocalDate.parse(radnikDateOfBirth);            // 2019-08-23
				        ////////////////////////////////////////////
				        // is this date older than 6 months?
				        if (newDate.isBefore(sixMonthsAgo)) {
				            System.out.println("date: " + newDate + " is older than 6 months!");
				      }  

					proba2.close();
					System.out.println("Uspesno sacuvan radnik.");
					
					
					
					
					
				   
				   
				}

				catch (IOException e) {
					System.out.println("Greskka.");
					e.printStackTrace();
				}
				
				
					
					
				

				break;

			case 3:
				//FileWriter proba2 = new FileWriter("proba2.txt", true);
				String filepath="proba2.txt";
				System.out.println("Upisite ID osobe koje zelite da uklonite: ");
				String removeTerm= input.nextLine();
				removeRecord(filepath,removeTerm);
				
				
					String tempFile="Temp.txt";
					File oldFile= new File (filepath);
					File newFile= new File (tempFile);
					String radnikId=""; String radnikFirstName=""; String radnikLastName=""; String radnikjmbg=""; String radnikDateOfBirth="";
					
					try{
						
						FileWriter fw= new FileWriter(tempFile,true);
						BufferedWriter bw= new BufferedWriter(fw);
						PrintWriter pw= new PrintWriter(bw);
						x= new Scanner(new File(filepath));
						x.useDelimiter("[,\n]");
					
						 while (x.hasNext()) {
							 radnikId= x.next();
							 radnikFirstName= x.next();
							 radnikLastName= x.next();
							 radnikjmbg= x.next();
							 radnikDateOfBirth= x.next();
							 if (!radnikIdequals(removeTerm));
							 {
								 pw.println(radnikId+","+radnikFirstName+","+radnikLastName+","+radnikjmbg+","+radnikDateOfBirth+",");
								 
							 }
						 }
						 x.close();
						 pw.flush();
						 pw.close();
						 oldFile.delete();
						 File dump= new File(filepath);
						 newFile.renameTo(dump);
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null ,"Error");
					}
				
				
			case 4:
				System.out.println();

				break;
			default:
				System.out.println("Morate uneti vrednost od 1 do 4!");

			}

		}
	}

	private static boolean radnikIdequals(String removeTerm) {
		// TODO Auto-generated method stub
		return false;
	}

	private static void removeRecord(String filepath, String removeTerm) {
		// TODO Auto-generated method stub
		
	}

	private void setDateOfBirth(String radnikDateOfBirth) {
		// TODO Auto-generated method stub

	}

	private void setJmbg(String radnikjmbg) {
		// TODO Auto-generated method stub

	}

	private void setLastName(String radnikLastName) {
		// TODO Auto-generated method stub

	}

	private void setFirstName(String radnikFirstName) {
		// TODO Auto-generated method stub

	}

	private void setId(int radnikId) {
		// TODO Auto-generated method stub
		  

	}
}
