public class CreditPaymentService {
    public double calculate(int creditAmount, int creditTime, double annuityCoeff) {
        double monthCoeff = annuityCoeff/100/12;
        int numbersOfPayment = 12 * creditTime;

        return creditAmount * (monthCoeff * Math.pow(1 + monthCoeff, numbersOfPayment) / (Math.pow(1 + monthCoeff, numbersOfPayment) - 1));
    }

}
