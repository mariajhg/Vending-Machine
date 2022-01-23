import java.util.Scanner;

public class VendingMachine {

        public static void main(String[] args) {

            String selection = null;
            boolean validId = false;
            int userId;
            int price = 0;
            boolean choice = true;

            Product p1 = new Product();
            p1.name = "Soda";
            p1.id = 101;
            p1.price = 265;

            Product p2 = new Product();
            p2.name = "Chips";
            p2.id = 102;
            p2.price = 325;

            Product p3 = new Product();
            p3.name = "Candy";
            p3.id = 103;
            p3.price = 225;

            Product p4 = new Product();
            p4.name = "Water";
            p4.id = 104;
            p4.price = 125;

            Product p5 = new Product();
            p5.name = "Coffee";
            p5.id = 105;
            p5.price = 475;

            while (choice == true) {
                System.out.println("     *****ITEMS*****");
                p1.showItems();
                p2.showItems();
                p3.showItems();
                p4.showItems();
                p5.showItems();

                Scanner keyboard = new Scanner(System.in);

                while (validId == false) {
                    System.out.print("Please enter id of product: ");
                    userId = keyboard.nextInt();

                    if (userId == 101) {
                        if (p1.checkInventory() == true) {
                            System.out.println(p1.name + " costs $" + p1.display);
                            selection = p1.name;
                            price = p1.price;
                            p1.amount = p1.amount - 1;
                            validId = true;
                        }
                    } else if (userId == 102) {
                        if (p2.checkInventory() == true) {
                            System.out.println(p2.name + " costs $" + p2.display);
                            selection = p2.name;
                            price = p2.price;
                            p2.amount = p2.amount - 1;
                            validId = true;
                        }
                    } else if (userId == 103) {
                        if (p3.checkInventory() == true) {
                            System.out.println(p3.name + " costs $" + p3.display);
                            selection = p3.name;
                            price = p3.price;
                            p3.amount = p3.amount - 1;
                            validId = true;
                        }
                    } else if (userId == 104) {
                        if (p4.checkInventory() == true) {
                            System.out.println(p4.name + " costs $" + p4.display);
                            selection = p4.name;
                            price = p4.price;
                            p4.amount = p4.amount - 1;
                            validId = true;
                        }
                    } else if (userId == 105) {
                        if (p5.checkInventory() == true) {
                            System.out.println(p5.name + " costs $" + p5.display);
                            selection = p5.name;
                            price = p5.price;
                            p5.amount = p5.amount - 1;
                            validId = true;
                        }
                    } else {
                        System.out.println("Invalid id. Please try again.");
                    }
                }

                Money m = new Money();
                m.count(price);

                int exit=1;
                System.out.println("Here is your " + selection + ".");
                System.out.println();
                System.out.println("Press 1 to make another purchase");
                System.out.print("or press 0 to exit: ");
                exit = keyboard.nextInt();

                while(exit!=0 && exit!=1)
                {
                    System.out.print("Invalid selection. Try again: ");
                    exit = keyboard.nextInt();
                }
                if(exit==0)
                {
                    choice=false;
                }
                else
                {
                    validId=false;
                }
            }
            System.out.println();
            System.out.println("Thank You!");
        }

}
