// Source code is decompiled from a .class file using FernFlower decompiler.
package case_study;

import framework.NormalAcc;
import framework.PrimeAcc;

public interface ShopFactory {
   PrimeAcc getNewPrimeAccount(int var1, String var2, float var3, boolean var4);

   NormalAcc getNewNormalAccount(int var1, String var2, float var3, float var4);
}
