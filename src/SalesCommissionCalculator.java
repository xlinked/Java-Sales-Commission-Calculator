import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {

        //Create scan obj to receive user input.
        Scanner scan = new Scanner(System.in);
        double commission = 0.09;
        double total = 0.0;
        double paycheck;
        int basePay = 200;
        int item = 0;
        int number;
        String line = null;

        //Program title.
        System.out.println("Sales Commission Calculator");
        System.out.println("----------------------------");

        //After user enters the amount sold of all 4 items the program calculates totals.
        while (item < 4) {
            item++;
            try {
                //User to enter the quantity of each item sold.
                System.out.print("Enter the quantity sold of product #" + item +": ");

                line = scan.nextLine();
                number = Integer.parseInt(line);

                //Item price * the number of items sold = the total amount sold.
                if (item == 1) {
                    total = total + number * 239.99;
                }
                else if (item == 2) {
                    total = total + number * 129.75;
                }
                else if (item == 3) {
                    total = total + number * 99.95;
                }
                else if (item == 4) {
                    total = total + number * 350.89;
                }
            }
            catch (NumberFormatException ex) {
                System.err.println("Invalid entry: " +line);
            }
        }
        paycheck = commission * total + basePay;
        commission = commission * total;
        System.out.println("-----------------------------------------");
        System.out.println("This weeks commission pay: $" + commission);
        System.out.println("This weeks total pay: $" + paycheck);
    }
}
