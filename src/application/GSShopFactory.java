// Source code is decompiled from a .class file using FernFlower decompiler.
package application;

import case_study.ShopFactory;

public class GSShopFactory implements ShopFactory {
   public GSShopFactory() {
   }

   public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
      return new GSPrimeAcc(accNo, accNm, charges, isPrime);
   }

   public GSNormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
      return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
   }
}
