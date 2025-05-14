
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // 12. Accept cost price and selling price, then find profit/loss in
        // percentage/amount

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sellingPrice = sc.nextDouble();

        double profitOrLoss = sellingPrice - costPrice;

        if (profitOrLoss > 0) {
            System.out.println("Profit: " + profitOrLoss+ " Rs.");
            System.out.println("Profit% : "+ (profitOrLoss/costPrice)*100);
        } else {
            System.out.println("Loss: " + (-profitOrLoss)+ " Rs.");
            System.out.println("Loss% : "+ (-profitOrLoss/costPrice)*100);
        }
    }
}