// Source code is decompiled from a .class file using FernFlower decompiler.
package framework;

public class PrimeAcc extends ShopAcc {
   private boolean isPrime;

   public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
      super(accNo, accNm, charges);
      this.isPrime = isPrime;
   }

   public void bookProduct(float charges) {
      System.out.println("Prime Account: Product booked with no delivery charges. Charges = " + charges);
   }

   public boolean isPrime() {
      return this.isPrime;
   }
}
