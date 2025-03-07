import java.util.ArrayList;
import java.util.Scanner;

public class EmailRunner {
  public static void main(String[] args) {

    /*
     * ArrayLists of student names and new emails.
     */
    ArrayList<String> studentNames = FileReader.toStringList("students.txt");
   
    EmailGenerator createdEmails = new EmailGenerator(studentNames);

    ArrayList<String> emails = createdEmails.generateEmails();

    /*
     * Generates all emails and
     * prints in the console.
     * Traverses through each email of
     * the emails
     */
    for(String email : emails) {
      System.out.println(email);
    }

    // User input and output
    Scanner input = new Scanner(System.in);
   
    // Prompt user for input
    System.out.println("Input your first and last name: ");
    String response = input.nextLine();

    String[] nameParts = response.split(" ");
    String firstNameLetter = nameParts[0].substring(0, 1).toLowerCase();
    String lastName = nameParts[1].toLowerCase();
   
    String userEmail = createdEmails.generateEmailForUser(firstNameLetter, lastName);
   
    System.out.println("Your email is: " + userEmail);

    input.close();
  }
}