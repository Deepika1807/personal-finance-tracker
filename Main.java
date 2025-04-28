import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FinanceTracker tracker = new FinanceTracker();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Personal Finance Tracker ---");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter income category: ");
                    String incomeCategory = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double incomeAmount = sc.nextDouble();
                    tracker.addTransaction("Income", incomeCategory, incomeAmount, LocalDate.now().toString());
                    break;
                case 2:
                    System.out.print("Enter expense category: ");
                    String expenseCategory = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double expenseAmount = sc.nextDouble();
                    tracker.addTransaction("Expense", expenseCategory, expenseAmount, LocalDate.now().toString());
                    break;
                case 3:
                    tracker.showReport();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
