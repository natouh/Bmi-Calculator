import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int pounds, feet, inches;
	double heightmeters, mass, BMI;
	
	System.out.println("Enter your weight in pounds");
	pounds = keyboard.nextInt();
	
	System.out.println("Enter your height in feet and inches separated by space");
	feet = keyboard.nextInt();
	inches = keyboard.nextInt();
	
	
	heightmeters = ((feet*12)+inches) * .0254;
	mass=pounds/2.2;
	
	BMI = mass / (heightmeters * heightmeters);
	
	if(BMI<18.5) {
				System.out.println("Your BMI is " +BMI);
				System.out.println("Your are underweight");
	}

	else if(BMI<25) {
				System.out.println("Your BMI is " +BMI);
				System.out.println("Your have normal weight");
	}

	else if(BMI<30) {
				System.out.println("Your BMI is " +BMI);
				System.out.println("Your are overweight");
	}	

	else {
				System.out.println("Your BMI is " +BMI);
				System.out.println("Your are obese");
	}
	}

}
