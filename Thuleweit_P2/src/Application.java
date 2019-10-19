public class Application {
    public static void main(String [] args) {
        SavingsAccount Saver1 = new SavingsAccount(2000.00);
        SavingsAccount Saver2 = new SavingsAccount(3000.00);
        int i;

        Saver1.modifyInterestRate(.04);
        Saver2.modifyInterestRate(.04);

        /* For initial balance and 12 months at 4% interest */
        for (i = 1; i <= 12; i++) {
            Saver1.calculateMonthlyInterest();
            Saver2.calculateMonthlyInterest();
        }
        System.out.print("Saver1's balance after 12 months: $");
        Saver1.printBalance();
        System.out.println("");
        System.out.print("Saver2's balance after 12 months: $");
        Saver2.printBalance();
        System.out.println("");

        /* Next month's balance after change to 5% interest rate */
        Saver1.modifyInterestRate(.05);
        Saver2.modifyInterestRate(.05);
        Saver1.calculateMonthlyInterest();
        Saver2.calculateMonthlyInterest();
        System.out.print("Next month's balance for Saver1: $");
        Saver1.printBalance();
        System.out.println("");
        System.out.print("Next month's balance for Saver2: $");
        Saver2.printBalance();
    }
}