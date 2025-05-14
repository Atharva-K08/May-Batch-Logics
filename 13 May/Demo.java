
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        int i = 1;
        while (i < n) {
            if (n % i == 0){
                sum += i;
            }
            i++;
        }
        if (num == sum){
            System.out.println(n + " is Perfect");
        } else {
            System.out.println(n + " is Perfect nahi");
        }

    }
}