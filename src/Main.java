public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int oneYearMonthPayment = (int)service.calculate(1_000_000, 1, 9.99);
        System.out.println(oneYearMonthPayment);

        int twoYearsMonthPayment = (int)service.calculate(1_000_000, 2, 9.99);
        System.out.println(twoYearsMonthPayment);

        int threeYearsMonthPayment = (int)service.calculate(1_000_000, 3, 9.99);
        System.out.println(threeYearsMonthPayment);
    }
}