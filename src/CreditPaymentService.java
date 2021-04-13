public class CreditPaymentService {
    public  double  calculate (int creditAmount, int creditTime, double creditRate) {
        double monthCoeff = creditRate / 100 / 12;
        int numbersOfPayment = 12 * creditTime;
        double r = Math.pow(1 + monthCoeff, numbersOfPayment);

        return  creditAmount * ((monthCoeff * r) / (r - 1));
    }

}
