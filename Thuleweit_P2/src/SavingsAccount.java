public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    /* Initialize savingsBalance to initial balance in account */
    public SavingsAccount(double initialBalance) {
        savingsBalance = initialBalance;
    }

    public static void modifyInterestRate (double newRate) {
        annualInterestRate = newRate;
    }

    /* Calculate interest for every month and add it to balance */
    public void calculateMonthlyInterest() {
        savingsBalance = savingsBalance + (savingsBalance * (annualInterestRate / 12));
    }

    public void printBalance() {
        System.out.printf("%.2f", savingsBalance);
    }
}