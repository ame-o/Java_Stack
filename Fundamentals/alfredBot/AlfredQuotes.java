import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello %s, what are you doing here?",name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "What a nice day! It is currently" + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1) {
            return "Alexis can't help you but I sure can.";
        }
        if(conversation.indexOf("Alfred") > -1) {
            return "But of course, anything in the name of Alfred.";
        }
        else{
            return "I will await any further instructions if needed. Otherwise, I will excuse myself.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

