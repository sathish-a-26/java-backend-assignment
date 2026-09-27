package oops_assignments;


	public class Developer extends Employee {

	    String programmingLanguage;

	    void displayDeveloper() {

	        displayEmployee();

	        System.out.println("Programming Language: " + programmingLanguage);
	    }

	    public static void main(String[] args) {

	        Developer d = new Developer();

	        d.name = "Sathish A";
	        d.id = 106033;
	        d.salary = 35000;
	        d.programmingLanguage = "Java";

	        d.displayDeveloper();
	    }
	}


