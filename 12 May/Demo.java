
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Monday");
        System.out.println("2. Tuseday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
        System.out.print("Enter No. of Day: ");
        int day = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
            if (age <= 13){
                System.out.println("Your Ticket Price is 100 Rs.");
            } else  if (age > 13 && age <= 65){
                System.out.println("Your Ticket Price is 150 Rs.");
            } else {
                System.out.println("Your Ticket Price is 130 Rs.");
            }
        } else {
            System.out.println("Weekend");
            if (age <= 13){
                System.out.println("Your Ticket Price is 120 Rs.");
            } else  if (age > 13 && age <= 65){
                System.out.println("Your Ticket Price is 180 Rs.");
            } else {
                System.out.println("Your Ticket Price is 150 Rs.");
            }
        }

    }
}