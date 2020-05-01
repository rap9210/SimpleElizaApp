import java.time.LocalDateTime;
import java.util.Scanner;

public class SimpleEliza {
    public static void main(String[] args) {
        /*
        1. import Scanner
        2. Display welcome message
        3. Assign user input to a variable
        4. Initiate loop under the condition that the user
        does not enter either 'q' or 'I am feeling great'.
        5. if the user enters 'I am feeling great display
        appropriate message before ending program.
         */

        Scanner scn = new Scanner(System.in);
        //imports local date and time, can pull individual day/hour/month/year with .get
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Enter your first name: ");
        String userName = scn.nextLine();

        //using .getHour() from local date time to print the
        //appropriate message given the time of the day
        if(localDateTime.getHour() < 12){
            System.out.println("Good morning "+userName);
        }
        else{
            System.out.println("Good afternoon "+userName);
        }

        //ElizaChat actually begins
        System.out.println("Welcome to ElizaChat, the #1 Yelp reviewed online therapist.\nNow, what can I help you with today?");
        System.out.println("Enter response here or 'Q' to quit:");
        String userResponse = scn.nextLine();
        //While loop statements are if userResponse is Not Q/q and Not 'I am feeling great'
        while((!userResponse.equalsIgnoreCase("Q"))&&(!userResponse.equalsIgnoreCase("I am feeling great"))){
            System.out.println("What makes you say "+userResponse+"? Enter response here or 'Q' to quit:");
            userResponse = scn.nextLine();
        }
        //If userResponse is 'I am feeling great' display special message
        if (userResponse.equalsIgnoreCase("I am feeling great")){
            System.out.println("Another success by ElizaChats! I will do you a favor and submit a Yelp review in your name.\nThank you "+userName+" :)");
        }

    }
}
