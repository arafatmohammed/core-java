
public class ImplicitCast {

	public static void main(String[] args) {

		byte b = 100;
		int i = b;
		System.out.println(i); // automatically converting byte to int

		long l = i;
		System.out.println(l); // automatically converting int to long

		char ch = 'A';
		int x = ch;
		System.out.println(x); // lower - > higher type variable, instead of showing A, it shows A's value in the character set

	}

}
