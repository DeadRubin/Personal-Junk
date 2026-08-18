import java.util.Scanner;
public class test {
    public static void main(String[] args){
// Print Statements
/*

    public static void main(String[] args){

        System.out.println("Hello");
        System.out.println("Hello, how are you doing");
        System.out.println("Hello, can you buy me pizza?");

    }
}
*/

// Variable Statements
/*
//int for whole numbers without decimal
    int age = 30;
        System.out.println("She is " + age);
//doubles are numbers with decimals 
    double gayness = 50.65;
        System.out.println("You Are " + gayness + "% Gay");
//chars are symbols or special characters
    char symbol = '&';
        System.out.println("You Could Should " + symbol + " in place of 'and'");
// booleans are true or false
    boolean areStudent = true;
        if(areStudent){
            System.out.println("You Are A Student Of This Facility");
        }
//Reference Variable
    String user = "You Are A Fag";
        System.out.println("Sir I Hate To Break It To You But " + user);
*/
//Scanner/User Input
    try (Scanner UserScanner = new Scanner(System.in)) {
    
        String username;

        System.out.print("What's Your Name? ");
        username = UserScanner.nextLine();
            System.out.println("Hello, " + username +
             " How Was Your Day? Also I Have A Question. ");

        //Student Checker
            boolean IsStudent;
            String verification;

            while (true) {
                System.out.print("Are You A Student? ");
                verification = UserScanner.nextLine();

            if (verification.equalsIgnoreCase("Yes")) {
                IsStudent = true;
                break;
            } else if (verification.equalsIgnoreCase("No")) {
                IsStudent = false;
                break;
            } else {
                System.out.println("Please Input Either Yes or No");
            }

        }
            String StudentResult = IsStudent ? "Student" : "Not A Student";
            System.out.println("Your Student Status is " + IsStudent);

        //Age Checker
        int age;

        System.out.print("How Old Are You? ");
        age = UserScanner.nextInt();
            if (age > 50) {
                System.out.println("You're Really Old");
            } else if (age >= 18) {
                System.out.println("You're A Bit Old");
            } else if (age < 18) {
                System.out.println("You're A Minor");
            } else {
                System.out.println("Please Input Your Age ");
            }
    //Add Youre a student call to output, have outputted boolean be read into a string
    UserScanner.close();
        System.out.println("I See, So Your Name Is " + username +
            ", You're " + StudentResult +
            " And You're " + age + " Years Old?");

        }
    }
}