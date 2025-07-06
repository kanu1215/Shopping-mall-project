
// Source code is decompiled from a .class file using FernFlower decompiler.
package case_study;

import application.GSShopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import java.util.Scanner;

public class GoShoppingApp {
   public GoShoppingApp() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Your Name: ");
      String accNm = sc.nextLine();
      int accNo = 9623;
      System.out.println("\nEnter the type of account you want to create:");
      System.out.println("1. Prime Account");
      System.out.println("2. Normal Account");
      int choice = sc.nextInt();
      ShopFactory factory = new GSShopFactory();
      switch (choice) {
         case 1:
            PrimeAcc primeAcc = factory.getNewPrimeAccount(accNo, accNm, 1000.0F, true);
            primeAcc.bookProduct(1000.0F);
            System.out.println(primeAcc.toString());
            break;
         case 2:
            NormalAcc normalAcc = factory.getNewNormalAccount(accNo, accNm, 1000.0F, 50.0F);
            normalAcc.bookProduct(1000.0F);
            System.out.println(normalAcc.toString());
            break;
         default:
            System.out.println("Invalid choice!");
      }

      sc.close();
   }
}
