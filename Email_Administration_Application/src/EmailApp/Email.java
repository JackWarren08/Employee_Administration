package EmailApp;

import java.util.Scanner;

public class Email {
//  Variables
  private String firstName;
  private String lastName;
  private String department;
  private String password;
  private String alternateEmail;
  private String email;
  private String companySuffix = "SalesForce.com";
  private int mailboxCapacity = 500;
  private  int passwordLenghtDefault = 10;

  //  Constructor to receive first and last name
  public Email(String firstName, String lastName) {
  this.firstName = firstName;
  this.lastName = lastName;

//  Getting user department
  this.department = setDepartment();

//  Create random password
  this.password = randomPassword(passwordLenghtDefault);
  System.out.print("\nYour Password is : " + password + "\n");

//  Combine elements to generate email
  email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +
          department + "." + companySuffix;
}

  // Getting employee department and returning it
  private String setDepartment() {
    System.out.print("Employee: " + firstName + " " + lastName +
                     "\nSelect your Department Number\n" +
                     "1) Sales\n" +
                     "2) Development\n" +
                     "3) Accounting\n" +
                     "4) None\n" +
                     "Department Number:");

    Scanner in = new Scanner(System.in);

    int depChoice = in.nextInt();

    if(depChoice == 1) { return "Sales"; }
    else if (depChoice == 2) { return "Dev"; }
    else if (depChoice == 3) { return "Acct"; }
    else { return ""; }
  }

  // Generating Random Password
  private String randomPassword(int lenght){
  String passwordSet = "ABCDEFGHIJKLMNOPQURWYZ!@#$%";
  char[] password = new char[lenght];

  for(int i = 0; i < lenght; i++) {
    int random = (int) (Math.random() * passwordSet.length());
    password[i] = passwordSet.charAt(random);
    }
  return new String(password);
  }

  // Set email box capacity
  public void setMailboxCapacity(int capacity){
  this.mailboxCapacity = capacity;
  }

  // Set Alternative Email
  public void setAlternateEmail(String altEmail){
  this.alternateEmail = altEmail;
  }

  // Get Alternative Email
  public String getAlternateEmail() {
    return alternateEmail;
  }

  //  Get Password
  public String getPassword() {
    return password;
  }

  //  Get email box capacity
  public int getMailboxCapacity() {
    return mailboxCapacity;
  }

  //Change Password
  public void changePassword(String password){
  this.password = password;
  }

  //Showing employee info
  public String showInfo(){
  return "\nYour Information: " +
         "\nDisplay Name: " + firstName + " " + lastName +
         "\nCompany Email: " + email +
         "\nMailBox Capacity: " + mailboxCapacity + "mb";
  }
}
