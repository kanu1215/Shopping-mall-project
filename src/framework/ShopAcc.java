// Source code is decompiled from a .class file using FernFlower decompiler.
package framework;

public abstract class ShopAcc {
   protected int accNo;
   protected String accNm;
   protected float charges;

   public ShopAcc(int accNo, String accNm, float charges) {
      this.accNo = accNo;
      this.accNm = accNm;
      this.charges = charges;
   }

   public int getAccNo() {
      return this.accNo;
   }

   public String getAccNm() {
      return this.accNm;
   }

   public float getCharges() {
      return this.charges;
   }

   public abstract void bookProduct(float var1);
}
