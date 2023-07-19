import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MetersConverter {
    public static void printHeader() {
        String workingDirectory = System.getProperty("user.dir");
        String localUsername = System.getProperty("user.name");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter datetimeFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy @ HH:mm:ss");
        String formattedNow = datetimeFormat.format(now);

        System.out.println("Working directory: " + workingDirectory);
        System.out.println("Local username: " + localUsername);
        System.out.println("Lab 18.4: " + formattedNow + "\n");
    }
        
    public static void showKilometers(float meters) {
    	float metersToKilometers = meters * 0.001f;
    	System.out.printf("%,.2f meters is %,.2f kilometers%n%n", meters, metersToKilometers);
    }
		
    public static void showInches(float meters) {
		float metersToInches = meters * 39.3701f;
    	System.out.printf("%,.2f meters is %,.2f inches%n%n", meters, metersToInches);
    }

    public static void showFeet(float meters) {
    	float metersToFeet = meters * 3.28084f;
    	System.out.printf("%,.2f meters is %,.2f feet%n%n", meters, metersToFeet);
    }
    	
    public static boolean menu(float meters, Scanner input) {
    	System.out.println("1. Convert to kilometers");
    	System.out.println("2. Convert to inches");
    	System.out.println("3. Convert to feet");
    	System.out.println("4. Quit the program" + "\n");
    	while (true) {
    		System.out.print("Enter your choice: ");
    		String choice = input.nextLine();
    		switch (choice) {
    			case "1":
    				showKilometers(meters);
    				return true;
    			case "2":
    				showInches(meters);
    				return true;
    			case "3":
    				showFeet(meters);
    				return true;
    			case "4":
    				System.out.println("Bye!");
    				return false;
    			default:
    				System.out.print("Invalid selection. ");
    		}
    	}
    }
    				
		
    public static void main(String[] args) {
    	printHeader();
		
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter your name: ");
    	String name = input.nextLine();
    	System.out.println("Hello, " + name);
    	System.out.print("Enter a distance in meters: ");
    	float meters = input.nextFloat();

    	boolean programRunning = true;
    	while (programRunning) {
    		programRunning = menu(meters, input);
    	}
    	input.close();
    }
}