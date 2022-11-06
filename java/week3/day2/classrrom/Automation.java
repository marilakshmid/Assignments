package week3.day2.classrrom;

public class Automation extends MultipleLangauge implements TestTool, Language {

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Learn Java");
	}

	public void javaScript() {
		// TODO Auto-generated method stub
		System.out.println("Learn JavaScript");
	}

	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Learn Ruby");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Learn Selenium");
	}
public static void main(String[] args) {
	Automation a = new Automation();
	a.java();
	a.javaScript();
	a.phython();
	a.selenium();
	a.ruby();
}
}
