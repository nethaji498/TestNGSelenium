package stringExamples;

public class MethodsOfStringClass {

	public static void main(String[] args) {
		//UpperCase() and toLowerCase()
		String s="Sachin";  
		System.out.println(s.toUpperCase());//SACHIN  
		System.out.println(s.toLowerCase());//sachin  
		System.out.println(s);//Sachin(no change in original)  
		
		//trim()
		
		String s1="  Sachin ";
		System.out.println(s1);
		System.out.println(s1.trim());
		
		//startsWith() and endsWith() method
		
		System.out.println(s.startsWith("Sa")); //true
		System.out.println(s.endsWith("n"));  //true
		
		//charAt() 
		
		System.out.println(s.charAt(0)); //s
		System.out.println(s.charAt(4)); //i
		
		//length()
		System.out.println(s.length()); //6
		 
		//intern() method
		
		String s3=new String("Sachin");  
		String s4=s3.intern();  
		System.out.println(s4);//Sachin
		
		//valueOf() method
		//coverts given type such as int, long, float, double, boolean, char and char array into string.
		
		int i=10;
		String s5=String.valueOf(i);
		System.out.println(s5+10);
		
		//replace() method
	//(replaces all occurrence of first sequence of character with second sequence of character.)
		
		String s6="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=s6.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
		System.out.println(replaceString);  
	}

}
