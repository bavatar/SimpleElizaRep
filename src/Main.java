import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Chat-bot program called Eliza.
    // This is a therapist program that interacts with the user
    // Evaluate what the user asks and turn the user's input into
    // a question that sounds like the therapist really cares.

    // Use a running loop. If user says "I am feeling great"
    // or enters "q" the program stops running
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> therapistList = new ArrayList<String>();
        ArrayList<String> userList = new ArrayList<>();
        String userStmt = "";
        userList.add("my teacher hates me");
        userList.add("I don't know what the problem is");
        userList.add("I feel sad");
        userList.add("I feel hyperactive");
        userList.add("I feel achey");
        userList.add("I have a headache");
        userList.add("I have anxiety");
        userList.add("I am feeling great");
//        userList.add("");
//        userList.add("");
//        userList.add("");

//Good day. What is your problem? Enter your response here or Q to quit:
        therapistList.add("If your teacher hates you then you could give her an apple.");
        therapistList.add("If you don't know what the problem is then");
        therapistList.add("");
        therapistList.add("");
        therapistList.add("");
        therapistList.add("");
        therapistList.add("");
        therapistList.add("");
        therapistList.add("");
        therapistList.add("");
        therapistList.add("");
        while (true) {
            System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
            userStmt= sc.nextLine();
            System.out.println(userStmt);
            if ((userStmt.equalsIgnoreCase("q")) || (userStmt.toLowerCase().contains("i am feeling great"))){
                break;
            }
        }
    }
}
