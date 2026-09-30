package condition;

public class LoginCheck {


	    public static void main(String[] args) {

	        String username = "admin";
	        String password = "12345";

	        if (username.equals("admin") && password.equals("12345")) {
	            System.out.println("login successful");
	        } else {
	            System.out.println("invalid login");
	        }
	    }
	}


