import java.util.Arrays;
import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int Attempts = 0;

        System.out.print("How Much Numbers Will Be Sorted: ");
        int Quantity = Input.nextInt();

        int[] Numbers = new int[Quantity];

        for (int i = 0; i < Quantity; i++) {
            System.out.print("Enter a Number: ");
            Numbers[i] = Input.nextInt();
        }
        for(int i = 0; i < Quantity - 1; i++) {
            for(int j = 0; j < Quantity - i - 1; j++) {
                Attempts++;
                if(Numbers[j] < Numbers[j + 1]) {
                    int Temp = Numbers[j];
                    Numbers[j] = Numbers[j + 1];
                    Numbers[j + 1] = Temp;
                }
                System.out.println("Attempt " + Attempts + ": " + Arrays.toString(Numbers));
            }
        }
        System.out.println("Total Attempts: " + Attempts);
        Input.close();
    }
}