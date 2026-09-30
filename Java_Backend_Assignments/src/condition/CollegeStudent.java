package condition;

public class CollegeStudent {
	

	    String name;
	    static String collegeName = "VVCET College";

	    CollegeStudent(String name) {
	        this.name = name;
	    }

	    void display() {
	        System.out.println(name + "-" + collegeName);
	    }
	}


