package day10And11.practice;

public class Laptop {
	public void start() {
		try {
			System.out.println("Starting up");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Problem");
			System.exit(0);
		} finally {
			System.out.println("Shutting down");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Laptop().start();
	}
}
