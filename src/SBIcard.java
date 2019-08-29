
public class SBIcard implements ATMcards {
	public void withdraw() {
		System.out.println("Money withdrawn successfully from SBI account");
	}

	public void deposit() {
		System.out.println("Money Deposit successfully in SBI account");
	}

	public void viewStatement() {
		System.out.println("Your transactions till now in SBI account");
	}

	public void changePassword() {
		System.out.println("Password Updated successfully in SBI account");
	}

}
