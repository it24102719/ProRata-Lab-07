import java.util.Scanner;

public class IT24102719Lab7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05;

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer + ":");

            System.out.print("Enter total bill amount: ");
            double billAmount = sc.nextDouble();

            char paymentMode;
            while (true) {
                System.out.print("Enter mode of payment (C - Cash, O - Other): ");
                paymentMode = sc.next().charAt(0);

                if (paymentMode == 'C' || paymentMode == 'c' || paymentMode == 'O' || paymentMode == 'o') {
                    break;
                } else {
                    System.out.println("Payment Mode is Not Valid");
                }
            }

            double discount = 0;
            double amountToPay = billAmount;

            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = billAmount * DISCOUNT_RATE;
                amountToPay = billAmount - discount;
            }

            System.out.println("Discount: " + discount);
            System.out.println("Amount to be Paid: " + amountToPay);
            System.out.println();
        }

        sc.close();
    }
}