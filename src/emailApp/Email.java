package emailApp;

import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String email;
   private int defaultPassLen = 10;
   private String department;
   private int mailboxCapacity;
   private String alternateEmail;	

   
   //constructor to receive the first and lastname
   public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);
	
		//call for askk department
		this.department = setDepartment();
		System.out.println("Department :" + this.department);
		
		//call for generate password
		this.password = randomPassword(defaultPassLen);
		System.out.println("Your password is :" + this.password);
	
        //generate email
		this.email = firstName + "." + lastName + "@" + department+ "."+ "company.com" ;	
		System.out.println("Email ID : " + email);
   }
   
   //ask department
   private String setDepartment(){
	    System.out.println("DPARTMENT CODES\n" + "1 for Sales\n" + "2 for Development\n" + "3 for Accounts\n" + "0 for none\n" + "Enter the department code :");
	    Scanner in = new Scanner(System.in);
	    int depChoice = in.nextInt();
	    if (depChoice == 1){return "sales";}
	    else if (depChoice == 2){return "dev";}
	    else if (depChoice == 3){return "accounts";}
	    else {return "";}
   }
   
   
   //generate random password
   private String randomPassword(int length){
	   String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&*";
	   char[] password = new char[length];
	   for(int i=0; i<length; i++){
		   int rand = (int)(Math.random() * passwordSet.length());
		   password[i] = passwordSet.charAt(rand);
		   
	   }
	   return new String(password);
   }
   
   
   //set mailbox capacity
   public void setMailboxCapacity(int mailboxCapacity){
	   this.mailboxCapacity = mailboxCapacity;
   }
   //alternate email
   public void setAlternateEmail(String altEmail){
	   this.alternateEmail = altEmail;
   }
   
   //change password
   public void password(String password){
	   this.password = password;
   }
   
   public int getMailboxCapacity(){return mailboxCapacity;}
   public String getAlternateEmail(){return alternateEmail;}
   public String getPassword(){return password;}
   
   public String showInfo(){
   
   return "Full Name : " + firstName + " " + lastName + "\nDepartment :" + department + "\nEmail Id :" + email;
    
   }
   
}
