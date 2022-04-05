// You will need to import the Random library from java.util
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{

    public ArrayList<Interger> getTenRolls(){
        ArrayList<Interger> result = new ArrayList<Interger>();
        Random randMachine = new Random();
        for (int i = 0; i < 11; i++){
            result.add(randMachine.nextInt(20) + 1);
        }
        return result;
    }

    public String getRandomLetter(){
        Random randMachine = new Random();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] letters = new String[26];
        for (int i = 0; i < 26; i++){
            alpha[i] = String.valueOf(randMachine.charAt(i));
        }
        return alpha[randMachine.nextInt(26)];
    }

    public String generatePassword(){
        String password = "";
        for(int i =0;i < 8; i++){
            password = password + getRandomLetter();
        }
        return password;
    }
}

// To use methods from the Random library you will need to create an instance of Random
// From there you can use any of the methods listed in the documentation. For example:
randMachine.setSeed(35679); // <--- you won't need to use this method.

