
public class PrimitiveAndObject {
	public static void main(String[] args) {

		int x = 100;
		Integer y = Integer.valueOf(x);	// Converting Primitive type to Object. using valueOf(x) is an object method of class or wrapper Integer
		int z = y.intValue(); // using inValue() from y is called object reference.
	}

}
