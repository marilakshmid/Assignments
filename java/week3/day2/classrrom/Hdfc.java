package week3.day2.classrrom;

public class Hdfc implements ReserveBankOfIndia {
	int balance = 500;
	String account_no = "123456789abcd";
	boolean approved = true;

	public void provideDebitCard() {
		// TODO Auto-generated method stub
		if (account_no == "123456789abcd") {
			System.out.println("Debit card is sent for this account :" + account_no);
		}
		else
			System.out.println("Debit card is not sent");
	}

	public void minimumBalance(int balance) {
		// TODO Auto-generated method stub

		if (balance < min_balance) {
			System.out.println("Rs.100 is debited from the account number. " + account_no);
		}
		else
			System.out.println("The balance is : " +balance);	
	}

	public void provideCreditCard(boolean approved) {
		if (approved=true)
			System.out.println("Credit card is sent for this account :" + account_no);
		else
			System.out.println("Credit card is not sent");
	}

}
