import java.util.Scanner;

public class Account {
	public static void main(String[] args) {
		debit();
	}

	public static void debit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account balance");
		int accountBalance = sc.nextInt();
		System.out.println("enter debit amount");
		int debitAmount = sc.nextInt();
		if (debitAmount > accountBalance) {
			System.out.println("balance =" + accountBalance);
		} else {
			accountBalance -= debitAmount;
			System.out.println("Account balance =" + accountBalance);
		}

	}
}
