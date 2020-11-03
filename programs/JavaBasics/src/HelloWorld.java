
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	static {
//		static block
//		All of this content will be executed, this will be loaded before running the main method
		System.out.println("Static Block 1"); // This will be printed first
	}
	
	static {
		System.out.println("Static Block 2"); // This will be printed first
	}	

}
