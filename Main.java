import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Determining the variables;
        double value;
        double valueVAT, realPrice;
        Scanner input = new Scanner(System.in);

        // Taking the value;
        System.out.println("Please enter an amount of money: ");

        do {
            value = input.nextDouble();
            if (value > 0){
                break;
            }else {
                System.out.println("Amount can not be negative: ");
                System.out.println("Reenter the value: ");
                continue;
            }
        }while (value < 0);

        // Code requirements;
        // Output information;
        while (true){
            if (value > 0 && value < 1000){
                valueVAT = value* 18/100;
                System.out.println("VAT amount: " + valueVAT);
                System.out.println("Value without VAT: " + (value - valueVAT) );
                System.out.println("Value with VAT: " + value);
                break;
            } else if (value >= 1000) {
                valueVAT = value * 8/100;
                System.out.println("VAT amount: " + valueVAT);
                System.out.println("Value without VAT: " + (value - valueVAT) );
                System.out.println("Value with VAT: " + value);
                break;
            }
        }
    }
}
