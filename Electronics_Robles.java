import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Electronics_Robles{
  public static void main(String[] args) throws FileNotFoundException{
    Scanner scnr = new Scanner(new File("student.txt"));
    Scanner sc = new Scanner(System.in);

    String cardholder1 = scnr.nextLine();
    String username1 = scnr.nextLine();
    String password1 = scnr.nextLine();
    String accountNum1 = scnr.nextLine();
    String routingNum1 = scnr.nextLine();
    String address1 = scnr.nextLine();
    String code1 = scnr.nextLine();

    String cardholder2;
    String username2;
    String password2;
    String accountNum2;
    String routingNum2;
    String address2;
    String code2;

    double deposit;
    int tries;
    int answerMM = 0;
    int quantityItem = 0;
    double amount = 0.0;
    double addToAmount = 0.0;
    int numItems = 0;
    int optionItem;
    int catalogNum;
    String yesOrNo = "Yes";

    System.out.printf("\nWelcome to UTEP Electronics!!");
    System.out.printf("\n\tUsername: ");
    username2 = sc.nextLine();
    System.out.printf("\tPassword: ");
    password2 = sc.nextLine();

    if (username1.equals(username2) && password1.equals(password2))
        tries = 4;
    else
        tries = 1;

    while (tries < 3)
    {
      System.out.print("\n***********************************************************************\n");
      System.out.println("Welcome to UTEP Electronics!");
      System.out.println("Sorry, you entered invalid credentials. Try again.");
      System.out.printf("\n\tUsername: ");
      username2 = sc.nextLine();
      System.out.printf("\tPassword: ");
      password2 = sc.nextLine();

      if (username1.equals(username2) && password1.equals(password2))
          tries = 4;
      else
          tries++;
    }

    if (tries == 3)
    {
      System.out.printf("\n***********************************************************************\n");
      System.out.println("Sorry, you are temporarily blocked from the platform.");
      System.out.println("Please try again in a couple hours.");
      System.out.printf("\n***********************************************************************\n");
    }

    else if (tries == 4)
    {
      do {
        System.out.printf("\n***********************************************************************\n");
        System.out.println("");
        System.out.println("Welcome " + cardholder1 + "!");
        System.out.println("Before you make any purchase, we need some info from your");
        System.out.println("Debit Card to perform a deposit.");
        System.out.println("Please enter: ");
        System.out.printf("\tCARDHOLDER NAME: ");
        cardholder2 = sc.nextLine();
        System.out.printf("\tACCOUNT NUMBER: ");
        accountNum2 = sc.nextLine();
        System.out.printf("\tROUTING NUMBER: ");
        routingNum2 = sc.nextLine();
        System.out.printf("\tADDRESS: ");
        address2 = sc.nextLine();

        if (!cardholder1.equals(cardholder2) || !accountNum1.equals(accountNum2) ||
        	!routingNum1.equals(routingNum2) || !address1.equals(address2))
          {
          System.out.printf("\n\n");
          System.out.println("Sorry, we do not recognize your Card Information.");
          System.out.println("Please try again.\n");
          }

        } while (!cardholder1.equals(cardholder2) || !accountNum1.equals(accountNum2) ||
        	!routingNum1.equals(routingNum2) || !address1.equals(address2));

        System.out.printf("\n\nExcellent! You are now ready to make a deposit.\n");
        System.out.printf("Enter deposit amount:  $");
        deposit = sc.nextDouble();

        while (deposit > 5000.0)  //negative values??
        {
          System.out.print("\n***********************************************************************\n");
          System.out.println("");
          System.out.println("Sorry, you can only deposit up to $5,000.00 into the account.");
          System.out.println("Try entering a lower amount.");
          System.out.printf("Enter deposit amount: $ ");
          deposit = sc.nextDouble();
        }


        while ( answerMM != 2)
        {
          System.out.print("\n***********************************************************************\n");
          System.out.println("Main Menu");
          System.out.println("Welcome " + cardholder1);
          System.out.printf("Subtotal amount: $ %.2f\n", amount);
          System.out.println("Cart: " + numItems);
          System.out.println("\t1.Search Item");
          System.out.println("\t2.Check out");
          System.out.println("Answer: ");
          answerMM = sc.nextInt();

          if (answerMM == 1)
          {
            System.out.print("\n***********************************************************************\n");
            System.out.println("Categories: ");
            System.out.println("\t1. TVs");
            System.out.println("\t2. Laptops");
            System.out.println("\t3. Cell Phones");
            System.out.println("\t4. Accessories");
            System.out.println("\t5. Go Back");
            System.out.printf("\nWhich catalog would you like to see: ");
            catalogNum = sc.nextInt();

            if ( catalogNum == 1 )
            {
              System.out.println("\n\tTVs");
              System.out.println("1.- Vizio 32\"\t$ 139.56 ");
              System.out.println("2.- LG 50\"\t$ 384.12");
              System.out.println("3.- Samsung 65\"\t$ 564.98");
              System.out.println("4.- SONY 70\"\t$ 819.47");
              System.out.println("5.- Go back to Main Menu");

              do {
                System.out.printf("\nEnter number of wanted item or 5 to Main Menu: ");
                optionItem = sc.nextInt();
                  if (optionItem > 0 && optionItem < 5)
                  {
                    System.out.printf("\nEnter quantity of item: ");
                    quantityItem = sc.nextInt();
                  }
                } while (optionItem > 5 || optionItem < 1);


              switch (optionItem)
              {
                case 1:
                    addToAmount = (139.56 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 2:
                    addToAmount = (384.12 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 3:
                    addToAmount = (564.98 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 4:
                    addToAmount = (564.98 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 5:
                    answerMM = 0;
                    break;
              }
            }

            else if ( catalogNum == 2 )
            {
              System.out.println("\n\t\tLaptops");
              System.out.println("1.- Surface GO!\"\t$ 549.99 ");
              System.out.println("2.- Apple MacBook Air\"\t$ 1299.99");
              System.out.println("3.- Lenovo\"\t\t$ 539.53");
              System.out.println("4.- HP Laptop\"\t\t$ 699.99");
              System.out.println("5.- Go back to Main Menu");

              do {
                System.out.printf("\nEnter number of wanted item or 5 to Main Menu: ");
                optionItem = sc.nextInt();
                  if (optionItem > 0 && optionItem < 5)
                  {
                    System.out.printf("\nEnter quantity of item: ");
                    quantityItem = sc.nextInt();
                  }
                } while (optionItem > 5 || optionItem < 1);


              switch (optionItem)
              {
                case 1:
                    addToAmount = (549.99 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 2:
                    addToAmount = (1299.99 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 3:
                    addToAmount = (539.53 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 4:
                    addToAmount = (699.99 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 5:
                    answerMM = 0;
                    break;
              }
            }

            else if ( catalogNum == 3 )
            {
              System.out.println("\n\tCell Phones");
              System.out.println("1.- iPhone 11\"\t\t$ 749.84 ");
              System.out.println("2.- Galaxy Fold\"\t$ 1980.00");
              System.out.println("3.- Galaxy S10\"\t\t$ 998.97");
              System.out.println("4.- Google Pixel\"\t$ 378.78");
              System.out.println("5.- Go back to Main Menu");

              do {
                System.out.printf("\nEnter number of wanted item or 5 to Main Menu: ");
                optionItem = sc.nextInt();
                  if (optionItem > 0 && optionItem < 5)
                  {
                    System.out.printf("\nEnter quantity of item: ");
                    quantityItem = sc.nextInt();
                  }
                } while (optionItem > 5 || optionItem < 1);


              switch (optionItem)
              {
                case 1:
                    addToAmount = (749.84 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 2:
                    addToAmount = (1980.00 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 3:
                    addToAmount = (998.97 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 4:
                    addToAmount = (378.78 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 5:
                    answerMM = 0;
                    break;
              }
            }

            else if ( catalogNum == 4 )
            {
              System.out.println("\n\tAccessories");
              System.out.println("1.- Apple Watch\"\t\t$ 214.08 ");
              System.out.println("2.- Keurig Coffe Maker\"\t\t$ 89.00");
              System.out.println("3.- Amazon Echo\"\t\t$ 72.51");
              System.out.println("4.- Nintendo Switch controller\"\t$ 61.19");
              System.out.println("5.- Go back to Main Menu");

              do {
                System.out.printf("\nEnter number of wanted item or 5 to Main Menu: ");
                optionItem = sc.nextInt();
                  if (optionItem > 0 && optionItem < 5)
                  {
                    System.out.printf("\nEnter quantity of item: ");
                    quantityItem = sc.nextInt();
                  }
                } while (optionItem > 5 || optionItem < 1);


              switch (optionItem)
              {
                case 1:
                    addToAmount = (214.08 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 2:
                    addToAmount = (89.00 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 3:
                    addToAmount = (72.51 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 4:
                    addToAmount = (61.19 * quantityItem);
                    amount = amount + addToAmount;
                    break;
                case 5:
                    answerMM = 0;
                    break;
              }
            }

            else if (catalogNum == 5)
            {
              System.out.println("\nGoing back to Main Menu");
              answerMM = 0;
            }

            if (catalogNum > 0 && catalogNum < 5)
            {
              numItems = numItems + quantityItem;
            }

            if (amount > deposit && answerMM != 0)
            {
              System.out.println("Not enough funds to add this item to the cart.");
              numItems = numItems - quantityItem;
              amount = amount - addToAmount;
            }
          }
        }

        if (answerMM == 2)
        {
            yesOrNo = sc.nextLine();

            do
            {
              System.out.printf("\n***********************************************************************\n");
              System.out.println("Are you sure you want to proceed with payment? (Yes/No)");
              yesOrNo = sc.nextLine();
            } while (!yesOrNo.equals("Yes") && !yesOrNo.equals("No"));

            if (yesOrNo.equals("No"))
            {
              System.out.printf("\n***********************************************************************\n");
              System.out.println("\nNo worries, we hope to hear from you soon!");
              System.out.println("Your budget is: $" + deposit);
              System.out.printf("\n***********************************************************************\n");
            }
            else if (yesOrNo.equals("Yes"))
            {
              do {
                System.out.printf("\nDo you have any promotional code? (Yes/No) ");
                yesOrNo = sc.nextLine();
              } while (!yesOrNo.equals("Yes") && !yesOrNo.equals("No"));

              if (yesOrNo.equals("Yes"))
              {
                System.out.printf("\nEnter promotional code: ");
                code2 = sc.nextLine();

                if (code1.equals(code2))
                    {
                      amount = amount * 0.8;
                      System.out.printf("\nCORRECT CODE!!! 20 Percent off");
                    }
                else
                  System.out.printf("\nIt wasn't the correct code. Sorry\n");
              }

              System.out.printf("\n***********************************************************************\n");
              System.out.printf("\nThank you for your purchase!!!");
              System.out.printf("\nYour items will be shipped to your address: \n" + address1);
              System.out.printf("\nTotal amount: $%.2f", amount);
              System.out.printf("\nRemaining Miner bucks is: $%.2f", (deposit-amount));
              System.out.printf("\n\n***********************************************************************\n");
            }
        }

    }
  }
}
