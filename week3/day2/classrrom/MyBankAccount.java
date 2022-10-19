package week3.day2.classrrom;

public class MyBankAccount {
public static void main(String[] args) {
	// implemented class
	Hdfc hdfc = new Hdfc();
	hdfc.minimumBalance(500);
	hdfc.provideCreditCard(true);
	hdfc.provideDebitCard();
	
	//interface
	ReserveBankOfIndia rbi = new Hdfc();
	rbi.minimumBalance(1000);
	rbi.provideDebitCard();
}
}
