
public class Concat {

	public static void main(String[] args) {

		String s1 = "xyz";
		String s2 = "abc";

		int a = 10, b = 20, c = 30;

		System.out.println(s1 + s2);
		System.out.println(a + b + c);

		System.out.println(s1 + a + b + c); // Numbers are not added but rather appended, because the first data type in
											// expression from left to right is a string and it assumes rest of the data
											// types are strings
		System.out.println(a + b + s1 + c);

		System.out.println(a + s1 + b + c);

		System.out.println(a + b + c + s1);
	}

}
