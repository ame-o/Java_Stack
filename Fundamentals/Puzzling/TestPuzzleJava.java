import java.util.ArrayList;
import java.util.Random;

public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava randomizer = new PuzzleJava();
		ArrayList<Integer> randomRolls = randomizer.getTenRolls();
		System.out.println(randomRolls);
		
		System.out.println(randomizer.getRandomLetter());
		System.out.println(randomizer.generatePassword());
		// System.out.println(randomizer.getNewPassword());
    	// //..
		// // Write your other test cases here.
		// //..
		// String
	}
}
