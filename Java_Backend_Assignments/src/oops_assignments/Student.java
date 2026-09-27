package oops_assignments;

public class Student {
	

	    String name;
	    int rollNo;
	    int mark;

	    void displayDetails() {
	        System.out.println(name);
	        System.out.println(rollNo);
	        System.out.println(mark);
	    }

	    public static void main(String[] args) {

	        Student s1 = new Student();

	        s1.name = "Sathish";
	        s1.rollNo = 33;
	        s1.mark = 85;

	        s1.displayDetails();
	    }
	}


