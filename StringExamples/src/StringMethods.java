

public class StringMethods {

	public static void main(String[] args) {
		String str = "Selenium";
		System.out.println(str.length());//To find the length of the string
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("u"));
		System.out.println(str.indexOf("e", 2));
		System.out.println(str.contains("en"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(3));
		System.out.println(str.substring(2,6));
		System.out.println(str.replace('e', 'a'));

	}

}
