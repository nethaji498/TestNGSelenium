

public class StringComparision {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "Java";
//		System.out.println(str1 == str2);
		String str3 = new String("Java");
		String str4 = new String("Java");
//		System.out.println(str3 == str4);
//		System.out.println(str1==str3);
		System.out.println(str3.equals(str1));
		

	}

}
