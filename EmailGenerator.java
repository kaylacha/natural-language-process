import java.util.ArrayList;

public class EmailGenerator {
 
  private ArrayList<String> names;
  private ArrayList<String> usernames;
  private ArrayList<Integer> digits;
 

  // Parameterized constructor for EmailGenerator class
  public EmailGenerator(ArrayList<String> names) {
    this.names = names;
    this.usernames = new ArrayList<String>();
    this.digits = new ArrayList<Integer>();
  }

  /*
   * Generates emails based on the
   * names in the 2D array
   */
  public ArrayList<String> generateEmails() {
    ArrayList<String> emailsList = new ArrayList<String>();
   
    for (int i = 0; i < names.size(); i++) {
      String[] nameParts = names.get(i).split(" ");
      String firstNameLetter = nameParts[0].substring(0, 1).toLowerCase();
      String lastName = nameParts[1].toLowerCase();
           
      String number = checkexistance(firstNameLetter + lastName);

      String email = firstNameLetter + lastName + number + "@mymail.lausd.net";

      emailsList.add(email);
    }
    return emailsList;
  }

  /*
   * Checks if username already exists or not
   * @param Checks if the base of the email already exists
   */
  public String checkExistance(String user) {
    for(int i = 0; i < usernames.size(); i++) {
      if(usernames.get(i).equals(user)) {
        Integer newNumber = digits.get(i) + 1;
        digits.set(i, newNumber);
        return "000" + newNumber;
      }
    }
        usernames.add(user);
        digits.add(1);
        return "0001";
  }


  /*
   * Generates emails
   * @param Input first and last name
   */
  public String generateEmailForUser(String firstNameLetter, String lastName) {
    String username = firstNameLetter + lastName;
    String number = checkExistance(username);
    return username + number + "@mymail.lausd.net";
  }


 
   }