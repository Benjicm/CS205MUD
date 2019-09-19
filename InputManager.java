import java.util.Scanner;

public class InputManager {

	private Scanner s;
	
	// this boolean toggles whether it should print out info based about the contents of the commands entered.
	private final boolean printCommandInfo = false; 

	public InputManager() {

		s = new Scanner(System.in);

	}


	public String[] getInput() {

		String in = s.nextLine();
		char[] chars = new char[in.length()];
		for(int i = 0; i < in.length(); i++) {
			chars[i] = in.charAt(i);
		}
		if(printCommandInfo) {
			for(char c: chars) {
				System.out.println("" + c);
			}
		}
		int commandCount = 1;
		for(int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ') {
				commandCount++;
			}
		}
		if(printCommandInfo) {
			System.out.println("Initial Command count: " + commandCount);
		}
		String[] inputs = new String[commandCount];
		int index = 0;
		for(int i = 0; i < inputs.length; i++) {
			inputs[i] = "";
			while(index < chars.length && chars[index] != ' ') {
				inputs[i] += chars[index];
				index++;
			}
			if(index < chars.length && chars[index] == ' ') {
				index++;
			}
		}

		for(int i = 0; i < inputs.length; i++) {
			if(inputs[i].length() == 0) {
				commandCount--;
			}
		}

		String[] returnedIn = new String[commandCount];
		int addIndex = 0;
		for(int i = 0; i < inputs.length; i++) {
			if(inputs[i].length() != 0) {
				returnedIn[addIndex] = inputs[i];
				addIndex++;
			}
		}
		if(printCommandInfo) {
			
			for(String s : returnedIn) {
				System.out.println(s);
			}
			
			System.out.println("Actuall Command Count: " + commandCount);
		}
		return returnedIn;
	}


}
