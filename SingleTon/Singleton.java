package SingleTon;

public class Singleton {

	private static Singleton sing = new Singleton();
	
	private Singleton() {}
	
	// Both the instance and the Constructor must be Private 
	
	public static Singleton getInstance() {
		return sing;
	}
	
	public void PrintMessage() {
		System.out.println("Hello World");
	}
}
