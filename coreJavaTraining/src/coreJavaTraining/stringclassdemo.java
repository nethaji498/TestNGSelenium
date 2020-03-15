package coreJavaTraining;


public class stringclassdemo {

public static void main(String[] args) {
// TODO Auto-generated method stub

//String : it is one of the prebuilt class in java
/* 1.String literal
2.by creating object of string*/

String a= "Java Training";//string 

/*System.out.println(a.charAt(2));
System.out.println(a.indexOf("e"));
System.out.println(a.substring(3, 6));
System.out.println(a.substring(5));
System.out.println(a.concat("rahul teaches"));
//a.length()
System.out.println(a.trim());
a.toUpperCase();
a.toLowerCase();
//split
String arr[]=a.split("t");
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(a.replace("t", "s")); */
System.out.println(a.length());

String f="";

for(int i=a.length()-1;i>=0;i--) {
	
	f=f+a.charAt(i);
}

System.out.println(f);
System.out.println(a);

if(a.equals(f)) {
	
	System.out.println("a is a palindrome");
}
else {
	System.out.println("a is not a palindrome");
}


}
}







