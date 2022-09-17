/* used to retrieve data from user */
import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double amount;
        double rateOfVat=0.18;


        //creating scanner class
        System.out.println("\n\n\t\t\t***Welcome to the my program*****\n\n\n");


        Scanner my_Input= new Scanner(System.in);
        System.out.println("Please enter the fee amount.");
        amount=my_Input.nextDouble();
        System.out.println("\n\n\t\tThe value you entered is "+amount+".\n\n");
        boolean result=(0<amount && amount<=1000);

        double checkOfVat= result ? 0.18:0.08;// checking the amount

        double amountOfVat=amount*checkOfVat;

        double sumOfQuantities=amount+amountOfVat;




        System.out.println("\tRate of Vat is: "+checkOfVat);
        System.out.println("\n\n\tAmount of Vat "+amountOfVat);
        System.out.println("\n\n\tSum of Quantities: "+sumOfQuantities );

        System.out.println("\n\t\t\tGood bye\n\n");
    }
}
