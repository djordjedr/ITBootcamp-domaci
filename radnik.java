public class radnik {

	private static String jmbg;
	private static String firstName;
	private static String lastName;
	private static  int id;
	private int remainingRestDays= 20;
	private static String dateOfBirth;
	
	
	
	public String getJmbg() { 				  //Getter  jmbg
		return jmbg;
	}
	
	public void setJmbg( String newJmbg) { 		//Setter jmbg
		this.jmbg= newJmbg;
		
	}
	
	
	public String getFirstName() {			// Get firstname
		return firstName;
	}
	
	public void setFirstName ( String newFirstName) { 	//ser firstname
		this.firstName= newFirstName;
	}
	
	
	public void setLastName ( String newLastName) {	//set lastname
		this.lastName= newLastName;
	}
	
	public String getLastName() {			//get lastname
		return lastName;
	}
	
	
	
	public int getId () {				// get id
		return id;
	}
	
	public void setId (int newId) {		//set id
		this.id= newId;
	}
	
	public int getRemainingRestDays() {		//get restdays
		return remainingRestDays;
	}
	
	public void setRemainingRestDays ( int newRemainingRestDays) {		// set restdays
		this.remainingRestDays= newRemainingRestDays;
	}
	
	public String getdateOfBirth() {			// get dateofbirth
		return dateOfBirth;
	}
	
	public void setdateOfBirth ( String newDateOfBirth) {	//setDateOfBirth
		this.dateOfBirth= newDateOfBirth;
	}
}