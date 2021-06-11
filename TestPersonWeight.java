import java.util.Scanner;

public class TestPersonWeight {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		PersonWeight info = new PersonWeight(); //This is where you access all the methods in PersonWeight.java you have name it info to access it easier
		
		System.out.printf("%16s", "Enter Full Name: ");
		String theName = input.nextLine();
		info.setName(theName);
		
		System.out.printf("%16s", "Enter Your Birth Year: ");
		int year = input.nextInt();
		info.setBirthYear(year);
		
		System.out.printf("%16s", "Enter Your Weight(in kilograms): ");
		double weight = input.nextDouble();
		info.setWeight(weight);
		
		System.out.printf("%16s", "Enter Your Height(in meters): ");
		double height = input.nextDouble();
		info.setHeight(height);

		System.out.printf("%16s", "Full Name: ");
		System.out.printf("%s%n", info.getName());
		System.out.printf("%16s", "Your Age is: ");
		System.out.printf("%d%n", info.getAge());
		System.out.printf("%16s", "Your Weight is: ");
		System.out.printf("%f%n", info.getWeight());
		System.out.printf("%16s", "Your Height is: ");
		System.out.printf("%f%n", info.getHeight());
		System.out.printf("%16s", "Your Bmi: ");
		System.out.printf("%f%n", info.computeBMI(weight, height));
		double bmivalue = info.computeBMI(weight, height);

		 
		classifyBMI(bmivalue);{
			if(bmivalue < 18.5) {
				System.out.printf("%16s", "Classification: Underweight");
			}
			else if(bmivalue > 18.5 && bmivalue < 25) {
				System.out.printf("%16s", "Classification: Normal Weight");
			}
			else if(bmivalue > 25 && bmivalue < 30) {
				System.out.printf("%16s", "Classification: Overweight");
			}
			else if(bmivalue > 30) {
				System.out.printf("%16s", "Classification: Obese");
			}
		}
		input.close();
	}
	
	private static void classifyBMI(double bmivalue) {
		//void function for classify bmi
	}
}

