package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the amount :");
        double price = input.nextDouble();

        System.out.print("Enter the card number :");
        String cardNumber = input.next();

        System.out.print("Enter expiration Date :");
        String date = input.next();

        System.out.print("Enter the security code :");
        String cvc = input.next();

        System.out.println("1.Abank");
        System.out.println("2.Bbank");
        System.out.println("3.Cbank");
        System.out.println("Choose bank");
        int selectBank = input.nextInt();


        switch (selectBank) {
            case 1 :
                Abank aPos = new Abank("a bank", "12346546", "45678");
                aPos.connect("127.1.1.");
                aPos.payment(price, cardNumber, date, cvc);
                break;


            case 2 :
                Abank bPos = new Abank("b bank", "12346", "22121");
                bPos.connect("127.1.1.");
                bPos.payment(price, cardNumber, date, cvc);
                break;

            default:
                System.out.println("Please enter valid bank");
        }
    }
}
