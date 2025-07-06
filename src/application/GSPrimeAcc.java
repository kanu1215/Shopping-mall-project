package application;

import framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    public void bookProduct(float charges) {
        System.out.println("THE CHARGES FOR PRIME USERS ARE: " + charges);
    }

    @Override
    public String toString() {
        return "GSPrimeAcc [Acc No=" + getAccNo() + ", Name=" + getAccNm() + ", Charges=" + getCharges() + "]";
    }
}