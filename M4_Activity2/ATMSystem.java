package m4_activity2;

public class ATMSystem {

    private static final double[] INITIAL = { 10000, 15000, 20000 };

    public static void processWithdrawal(String accountIndex, String amountInput) {
        System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);

        try {
            int idx = Integer.parseInt(accountIndex);         
            double amount = Double.parseDouble(amountInput); 

         
            double current = INITIAL[idx];             

            System.out.println("Current balance: P" + String.format("%.2f", current));
            System.out.println("Withdrawal: P" + String.format("%.2f", amount));

            if (amount > current) {
                System.out.println("Insufficient funds! Cannot withdraw P" + String.format("%.2f", amount));
                return;
            }

            double newBal = current - amount;

            System.out.println("New balance: P" + String.format("%.2f", newBal));
            System.out.println("Withdrawal successful!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input!");
            System.out.println("Please enter valid numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Account not found!");
            System.out.println("Invalid account index.");
        } catch (Exception e) {
            System.out.println("Transaction failed (unexpected error).");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== ATM Withdrawal System ===");

        System.out.println("\n--- Test 1: Valid Withdrawal ---");
        processWithdrawal("1", "5000");

        System.out.println("\n--- Test 2: Invalid Account Index ---");
        processWithdrawal("abc", "5000");

        System.out.println("\n--- Test 3: Account Not Found ---");
        processWithdrawal("10", "5000");

        System.out.println("\n--- Test 4: Insufficient Funds ---");
        processWithdrawal("1", "20000");

        System.out.println("\n--- All tests completed! ---");
    }
}
