
public class ObjectAndString {

	public static void main(String[] args) {

		long x = 1000;
		
		Long y = Long.valueOf(x); // Primitive type to a wrapper type, Long y is an object
	
		
		// Convert Long y to a string
		String s = y.toString();		
		
		// String back to the object
		Long z = Long.valueOf(s);
		
	}

}
