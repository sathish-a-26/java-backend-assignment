package condition;

public class EmployeeSalary {
	

	    static int count = 0;

	    public static void main(String[] args) {

	        final double tax = 10;

	        double[] salary = {45000, 60000, 35000, 75000, 52000};

	        for (int i = 0; i < 5; i++) {

	            count++;

	            double taxamount = salary[i] * tax / 100;
	            double netsalary = salary[i] - taxamount;

	            System.out.println("salary: " + salary[i]);
	            System.out.println("tax: " + taxamount);
	            System.out.println("net salary: " + netsalary);

	            if (salary[i] > 50000) {
	                System.out.println("high salary");
	            } else {
	                System.out.println("normal salary");
	            }

	            System.out.println();
	        }

	        System.out.println("employee count: " + count);
	    }
	}


