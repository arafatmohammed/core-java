
public class AllinOne {

	public static void main(String[] args) {

		int x = 100;
		
		// Converting to String
		String y = Integer.toString(x); // Wrapper class for int is Integer
		
		// Create a new integer from String
		
		Integer b = new Integer(y);
		
		// Converting back to primitive
		int z = b.intValue();
		
		Integer c = new Integer(z);
		
		String d = c.toString(c);
		
		// Convert String to Primitive
		
		int e = Integer.parseInt(d);
	}

}
