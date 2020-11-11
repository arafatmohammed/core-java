
public class PrimitiveAndString {

	public static void main(String[] args) {

		byte x = 100;

		String s = Byte.toString(x); // primitive to string

		byte y = Byte.parseByte(s); // string to primitive 
	}

}
