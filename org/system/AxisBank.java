package org.system;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit Account - Axis bank");
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.saving();
		a.fixed();
		a.deposit();
	}
}
