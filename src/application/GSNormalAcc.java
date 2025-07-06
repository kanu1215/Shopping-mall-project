package application;

import framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
        super(accNo, accNm, charges, deliveryCharge);
    }

    public void bookProduct(float charges) {
        float totalCharge = charges + getDeliveryCharge();
        System.out.println("\nYour Product Charges are: " + charges);
        System.out.println("Your Delivery Charges are: " + getDeliveryCharge());
        System.out.println("Your Total Charges are: " + totalCharge);
    }

    @Override
    public String toString() {
        return "\nDear Normal User ...\nYour account is created with Number: " + getAccNo()
                + " & Your Name is: " + getAccNm();
    }
}