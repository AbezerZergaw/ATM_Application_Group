import java.io.IOException;
import java.util.Scanner;

public class ATM {
	
	private double amount;
	
	
	static Scanner input = new Scanner(System.in);
	
	static String[] user = {"12345","98745","36987"};
	static String[] pin = {"000","111","222"};
	static double[] balance = {500.0,690.0,789.0};
	
	
	private static boolean validatePin(String accountNumber, String pin2) {
		
		int count=0;
		
		do {
			
			for(int i =0; i<3;i++) {
			if ((accountNumber.equals(user[i])) && (pin2.equals(pin[i]))) {
				System.out.println("Choose the type of service that you want ! 1. deposit 2. withdraw 3. check balance");
				int number = input.nextInt();
				if (number == 1) {
					//double totalBalance = balance[0];
					deposit(balance[i]);
				} else if (number == 2) {
					withdraw();
				} else {
					checkBalance();
				}

			}
			
			}
			
		System.out.println("You Put wrong pin or password try again !");	
		count++;
			
	}while(count!=3 );
		return false;
	
	}
	
	public static void deposit(double balance) {
		System.out.println("enter the amount you want to deposit ?");
		double deposit = input.nextDouble();
		balance = balance+deposit;
		System.out.println("your current balance is:"+ balance);
		
	}
	
	public static void withdraw() {
		
	}
	
	public static void checkBalance() {
		
	}

	public static void main(String[] args) {
		
	
		Account account1 = new Account();
		int count=0;
		
		do {
		
		System.out.println("Enter the acct number");
		String accnum = input.nextLine();
		account1.setAccountNumber(accnum);
		System.out.println("Enter the pin number");
		String pin1 =input.nextLine();
		account1.setPin(pin1);
		// validate the pin 
		
		
		boolean check = validatePin(account1.getAccountNumber(),account1.getPin());
		
		if(check) {
			System.out.println("");
			//deposit ()
			//withdraw()
			//checkBalance()
		}
		else {
			//block the user 
		}
		
		
		}while(count!=3);
		
		

	}

	
}
