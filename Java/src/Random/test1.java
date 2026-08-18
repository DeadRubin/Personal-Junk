import java.util.Scanner;

public class test1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        while (true) {

        System.out.print("Enter your name: ");
        name = scanner.nextLine();  
        if (name.matches(".*\\d.*")) {
            System.out.println("Invalid Name, your name cannot contain numbers.");
            continue;
        }
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        if (age < 0 || age > 120) {
            System.out.println("Invalid Age, Enter Your Actual Age.");
            continue;
        }
        DisplayInformation(name, age);
        }
    }
    static void DisplayInformation(String name, int age) {
        System.out.println("You are " + name + " and you are " + age + " years old.");
    }
}