
public class AtmMachine {
	ATMcards atmCard;

	public void insertCard(ATMcards atmCard) {
		this.atmCard = atmCard;
	}

	public void performWithdraw() {
		atmCard.withdraw();
	}

	public void performDeposit() {
		atmCard.deposit();
	}

	public void changePassword() {
		atmCard.changePassword();
	}

	public void viewStatement() {
		atmCard.viewStatement();

	}

	public static void main(String[] args) {

		AtmMachine atmMachine = new AtmMachine();
		SBIcard sbi = new SBIcard();
		HDFCcard hdfc = new HDFCcard();

		atmMachine.insertCard(sbi);
		atmMachine.performWithdraw();
		System.out.println("---------------------------");
		atmMachine.performDeposit();
		System.out.println("---------------------------");
		atmMachine.changePassword();
		System.out.println("---------------------------");
		atmMachine.viewStatement();
		System.out.println("---------------------------");

		System.out.println("---------------------------");

		atmMachine.insertCard(hdfc);
		atmMachine.performWithdraw();
		System.out.println("----------------------------");
		atmMachine.performDeposit();
		System.out.println("----------------------------");
		atmMachine.changePassword();
		System.out.println("----------------------------");
		atmMachine.viewStatement();
	}

}
