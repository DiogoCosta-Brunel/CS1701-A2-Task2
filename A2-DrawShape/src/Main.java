import java.util.Scanner;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Main {	
	static String[][] mainMenuOptions = new String[][]{
	    {"R","Rectangle"},
	    {"T","Triangle"},
	    {"Q","Quit"}
	};
	
	static Scanner scan = new Scanner(System.in);;
	public static Finch myFinch = new Finch();

	public static void main(String[] args) throws ShapeException {
		// TODO Auto-generated method stub
		while (true) {
			String optionSelected = DisplayOptions();
			boolean inputValid = CheckInput(optionSelected);
			
			if (inputValid)  { // IF its True
				switch (optionSelected) {
					case "R":
						try {
							int[] measurements = GetMeasurements();
							Rectangle myRect = new Rectangle(measurements[0], measurements[1]);
							myRect.draw();
						} catch (ShapeException e) {
							System.out.println(e);
						}
						break;
						
					case "T":
						break;
						
					case "Q":
						scan.close();
						break;
				}
			}
		}
	}
	
	public static int[] GetMeasurements() {
		int[] measurements = new int[2];
		
		System.out.print("Width: ");
		int width = scan.nextInt();
		System.out.print("Height: ");
		int height = scan.nextInt();
		
		measurements[0] = width;
		measurements[1] = height;
		
		return measurements;
	}
	
	public static String DisplayOptions() {
		System.out.println("Welcome, please select one of the options below:");
		for (int i = 0; i < mainMenuOptions.length; i++) {
			String textToDisplay = mainMenuOptions[i][0] + " - ";
			// Quit is exempt from having "Draw" be added to its text display
			// Have both statements, in case "Quit" becomes "Exit", or another term
			// with the same meaning
			if (mainMenuOptions[i][1] == "Quit" || mainMenuOptions[i][0] == "Q") {
				textToDisplay += mainMenuOptions[i][1];
			}
			
			else {
				textToDisplay += "Draw " + mainMenuOptions[i][1];
			}
			
			System.out.println(textToDisplay);
		}
		System.out.println();
		System.out.print("Option: ");
		String optionSelected = scan.next();
		optionSelected = optionSelected.toUpperCase();
		
		return optionSelected;
	}
	
	public static boolean CheckInput(String text) {
		
		boolean validInput = false;
		
		for (int i = 0; i < mainMenuOptions.length; i++) {
			if (!mainMenuOptions[i][0].equals(text)) {
				System.out.println("Dear user, the option (" + text + ") "
						+ "is not a valid option. Could you please try again?\n");
			}
			
			else {
				return true;
			}
		}
		return validInput;
		
	}

}
