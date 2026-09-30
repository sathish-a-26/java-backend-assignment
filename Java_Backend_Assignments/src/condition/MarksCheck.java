package condition;

public class MarksCheck {
	

	    public static void main(String[] args) {

	        int[] marks = {45, 67, 32, 80, 50};

	        for (int i = 0; i < 5; i++) {

	            if (marks[i] > 50) {
	                System.out.println(marks[i] + "-pass");
	            } else {
	                System.out.println(marks[i] + "-fail");
	            }
	        }
	    }
	}


