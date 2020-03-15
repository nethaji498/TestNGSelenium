public class CharacterCount {

	public static void main(String[] args) {
		String str = "test,,,,,,,iutoisdjvcl";
		String str1 = str.replaceAll(",", "");
		System.out.println(str.length()-str1.length());

	}

}
