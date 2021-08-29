package emailapp;

public class EmailApp {
	public static void main(String[] args) {
		Email em1 = new Email("Cornelius", "Fudge");
		em1.setAlternateEmail("jerry@mayo.com");
		System.out.println(em1.showInfo());
	}
}
