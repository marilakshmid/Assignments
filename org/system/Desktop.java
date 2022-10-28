package org.system;

public class Desktop extends Computer {
	String display = "4x5";

	public void desktopSize() {
		System.out.println("The desktop size is " + display);
	}

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.desktopSize();
		desktop.computerModel();
	}
}
