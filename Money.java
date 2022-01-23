import java.util.Scanner;

public class Money extends VendingMachine{
    public static void count (int price){
        int bills;
        int cents;
        int money;
        double change;
        double need;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter amount in bills (ex: 4 for 4 dollars): ");
        bills = keyboard.nextInt();
        System.out.print("Please enter amount in cents (ex: 34 for 34 cents): ");
        cents = keyboard.nextInt();

        bills=bills*100;
        double total=cents+bills;
        money=cents+bills;
        total=Math.round(total);
        total=total/100;
        System.out.println("You entered $" + total);

        while (money<price)
        {
            need=(price-money);
            need=Math.round(need);
            need=need/100;
            System.out.println("Insufficient funds.");
            System.out.println("Please enter $" + need +"");
            System.out.print("Please enter amount in bills (ex: 4 for 4 dollars): ");
            bills = keyboard.nextInt();
            System.out.print("Please enter amount in cents (ex: 34 for 34 cents): ");
            cents = keyboard.nextInt();
            bills=bills*100;
            money=money+cents+bills;
        }

        change=money-price;
        change=Math.round(change);
        change=change/100;
        System.out.println();
        System.out.println("Your change is $" + change);

        int quarters = (money-price)/25;
        int dimes = ((money-price)%25)/10;
        int nickels = (((money-price)%25)%10)/5;
        int pennies = (((money-price)%25)%10)%5;

        System.out.println("Q: " + quarters);
        System.out.println("D: " + dimes);
        System.out.println("N: " + nickels);
        System.out.println("P: " + pennies);
    }
}
