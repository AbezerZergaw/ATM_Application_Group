
public class Account {
	
	    private String accountNumber;
	    private String userName;
	    private static final double balance=500;
	    private String pin;
	    
	    
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPin() {
			return pin;
		}
		public void setPin(String pin) {
			this.pin = pin;
		}
		public static double getBalance() {
			return balance;
		}
	   
	    
	    

}
