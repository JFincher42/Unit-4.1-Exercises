import java.util.Scanner;

public class WeatherArray {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("How many temperatures? ");
		int numTemps = console.nextInt();
		int[] tempArray = new int[numTemps];
		int total = 0;
		int hotDays = 0;

		for (int i = 0; i < numTemps; i++) {
			System.out.print("Enter temperature for day " + (i + 1) + ": ");
			int temperature = console.nextInt();
			total += temperature;
			tempArray[i] = temperature;
		}

		double average = (double)total / numTemps;
		for (int i = 0; i < numTemps; i++) {
			if (tempArray[i] > average) {
				hotDays += 1;
			}
		}
		System.out.println(hotDays + " days were above average.");
		console.close();
	}
}
