import java.util.ArrayList;

public class FinanceTracker {
    private ArrayList<Transaction> transactions;

    public FinanceTracker() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(String type, String category, double amount, String date) {
        Transaction t = new Transaction(type, category, amount, date);
        transactions.add(t);
    }

    public void showReport() {
        double totalIncome = 0;
        double totalExpense = 0;

        System.out.println("\n--- Finance Report ---");
        for (Transaction t : transactions) {
            System.out.println(t.getDate() + " | " + t.getType() + " | " + t.getCategory() + " | $" + t.getAmount());
            if (t.getType().equalsIgnoreCase("Income")) {
                totalIncome += t.getAmount();
            } else {
                totalExpense += t.getAmount();
            }
        }

        System.out.println("\nTotal Income: $" + totalIncome);
        System.out.println("Total Expense: $" + totalExpense);
        System.out.println("Savings: $" + (totalIncome - totalExpense));
    }
}

