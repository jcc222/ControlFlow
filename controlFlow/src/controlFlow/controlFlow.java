package controlFlow;
import java.util.*;

public class controlFlow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = sc.next();
		System.out.println("Hello " +  name + "!");
		System.out.println("Would you like to continue? Enter yes or y to continue.");
		String cont = sc.next();
		boolean loopYes = true;
		if (cont.equals("yes")||cont.equals("y")) {
			while (loopYes == true) {
				System.out.println("What is the name of your favorite pet? (i.e. Lucky, Gizmo, Spot)");
				String petName = sc.next();
				System.out.println("Please enter the age of your favorite pet: (i.e. 1, 5, 6)");
				int petAge = sc.nextInt();
				System.out.println("What is your lucky number? (i.e. 56, 4, 110)");
				int lucky = sc.nextInt();
				System.out.println("Do you have a favorite quarterback? (i.e. y or n)");
				String qrt = sc.next();
				int jersey = 0;
				if (qrt.equals("y")||qrt.equals("yes")) {
					System.out.println("What is is their jersey number? (i.e. 01, 56, 32)");
					jersey = sc.nextInt();
				}else {
					System.out.println("No worries. Onto the next question!");
				}
				System.out.println("What is the two digit model year of your car? (i.e. 95, 02, 65)");
				int carYear = sc.nextInt();
				System.out.println("What is the first name of their favorite actor or actress? (i.e. Meryl, Antonio, Angelina)");
				String act = sc.next();
				System.out.println("Enter a random number betwen 1 and 50: ");
				int randomNum = sc.nextInt();
				System.out.println("Would you like to generate another set of numbers? Enter y or n.");
				String gen = sc.next();
				if (gen.equals("y")||gen.equals("yes")) {
					loopYes = true;
				}
				else {
					loopYes = false; 
				}
				
				Random rand = new Random();
				int[] randomNumberArray = new int[3];
				for (int i = 0; i<3; i++) {
					randomNumberArray[i] = rand.nextInt(11);
				}
				int mBall = lucky * randomNumberArray[0];
				if (mBall>75) {
					mBall -= 75;
				}
				final int max5 = 65;
				int first = carYear + lucky;
				if (first > max5) {
					first -= 65;
				}
				int second = randomNum - randomNumberArray[1];
				if (second < 0) {
					second += randomNumberArray[1] - randomNum;
				}
				int third = 42;
				int fourth = petAge + carYear;
				if (fourth > max5) {
					fourth -= 65;
				}
				int fifth = jersey + petAge + lucky;
				if (fifth > max5) {
					fifth -= 65;
				}
				
				System.out.println("Lottery numbers: " + first + ", " + second + ", " + third + ", " + fourth + ", " + fifth + "  Magic ball: " + mBall);
				System.out.println("Would you like to generate another set of numbers? Enter y or n.");
				gen = sc.next();
				if (gen.equals("y")||gen.equals("yes")) {
					loopYes = true;
				}
				else {
					loopYes = false; 
				}
				
			}
		}else {
			System.out.println("You selected to not continue. Please return later to complete the survey. Goodbye.");
		}
		
		

	}

}
