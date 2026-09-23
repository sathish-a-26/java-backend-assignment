package java_all_assignments;

public class Operators_and_typecasting_assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. Student Marks Calculation
        int marks = 85;
        double percentage = (double) marks / 100 * 100;

        System.out.println("Student Percentage = " + percentage + "%");


        // 2. Product Price Calculation
        double price = 999.50;
        int quantity = 3;

        double total = price * quantity;
        double discount = total * 10 / 100;

        total -= discount;

        System.out.println("Final Product Price = " + total);


        // 3. Employee Salary
        int salary = 25000;
        double increment = salary * 15 / 100.0;

        double newSalary = salary + increment;

        System.out.println("New Salary = " + newSalary);
        System.out.println("Salary greater than 28000: " + (newSalary > 28000));


        // 4. Number Conversion
        double value = 25.75;
        int number = (int) value;

        System.out.println("Converted Number = " + number);

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }


        // 5. Driving Eligibility
        double age = 21.5;
        int ages = (int) age;

        boolean eligible = ages >= 18 && ages <= 60;

        System.out.println("Age = " + ages);
        System.out.println("Eligible for driving license: " + eligible);
        

	}

}
