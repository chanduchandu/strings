package package1;

public class Str1 {
	public static void main(String[]args){
	String s1=new String("malayala");
	char[]a=s1.toCharArray();
	int b=s1.length();
	String reverse="";
	for(int i=b-1;i>=0;i--){
		reverse=reverse+a[i];
	}
	if(s1.equals(reverse)){
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");

}
}