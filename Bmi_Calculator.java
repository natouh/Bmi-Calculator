import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		System.out.println("The program will calculate the number of 230 calorie Candy bars to eat to maintain your weight.");
		Scanner myObj = new Scanner(System.in);
		System.out.println("What is your age in years?");
		int age = myObj.nextInt();
		int chocolate = 230;
		System.out.println("What is your total height in feet?");
		double height = myObj.nextDouble();
		System.out.println("What is your weight in kilograms?");
		double weight = myObj.nextDouble();
		
		
		double bmrMale = 665+(4.3 * (weight* 2.205))+(4.7 * (height * 12))-(4.7*age);
		double bmrFemale = 66+(6.3 * (weight * 2.205))+(12.9 * (height * 12))-(6.8*age);
		double totalBarsFemale = bmrFemale/230;
		double totalBarsMale = bmrMale/230;
		
		
		
		System.out.println("A female with those measurements should eat " + totalBarsFemale + "candy bars per day to maintain her weight"); 
		System.out.println("A male with those measurements should eat " + totalBarsMale + "candy bars per day to maintain his weight ");
		System.out.println(bmrFemale/chocolate);
		System.out.println(bmrMale/chocolate);
	}

}
