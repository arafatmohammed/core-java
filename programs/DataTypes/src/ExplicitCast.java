
public class ExplicitCast {

	public static void main(String[] args) {

		int i = 100;
//		byte b = i; // Byte cannot be converted to int until casted
		byte b = (byte) i; // explicit type casting from higher to lower type

		int x = 97;
		char ch = (char) x; // explicit type casting from higher to lower type
		System.out.println(ch);

		int y = 130;

		byte z = (byte) y;
		System.out.println(z);

		int m = 612;
		byte n = (byte) m;
		char o = (char) n;
		System.out.println(o);

	}

}
