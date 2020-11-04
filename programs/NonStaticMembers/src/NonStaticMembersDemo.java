
public class NonStaticMembersDemo {
	int num; // non-static variable. When we do not use static keyword, it is a non-static member
	
	NonStaticMembersDemo(){
		// This method is a constructor, this does not have a return type. It can take arguments.
		System.out.println("Inside the constructor");
	}
		
	
	{
		// Non-Static Block
		System.out.println("Inside the non static block");
	}
	
	public static void main(String[] args) {
		System.out.println("inside the main method");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		
		obj.doSomething();
		
	}
	
	static {
		System.out.println("Inside the static block");
	}
	
	void doSomething() {
		System.out.println("Inside doSomething");
	}
}
