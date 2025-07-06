// Source code is decompiled from a .class file using FernFlower decompiler.
package framework;

public class NormalAcc extends ShopAcc {
   protected float deliveryCharge = 50.0F;

   public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
      super(accNo, accNm, charges);
      this.deliveryCharge = deliveryCharge;
   }

   public void bookProduct(float charges) {
      float total = charges + this.deliveryCharge;
      System.out.println("Your Product Charges are: " + charges);
      System.out.println("Your Delivery Charges are: " + this.deliveryCharge);
      System.out.println("Your Total Charges are: " + total);
   }

   public String toString() {
      int var10000 = this.getAccNo();
      return "\nDear Normal User...\nYour account number is " + var10000 + " & Your Name is " + this.getAccNm();
   }

   public float getDeliveryCharge() {
      return this.deliveryCharge;
   }

   public void setDeliveryCharge(float deliveryCharge) {
      this.deliveryCharge = deliveryCharge;
   }
}
