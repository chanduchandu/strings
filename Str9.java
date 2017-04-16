import java.util.Scanner;
class Str9 
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String []s2=s1.split("_");
	int a=s2.length;
	int i;
	String ss=s2[1].substring(1,(s2[1].length()-1));

	String result="";
	String hello(){	
	for(i=1;i<a-1;i++){
	result=result+s2[i].substring(1,(s2[i].length()-1));
	}
	result=s2[0].substring(0,(s2[0].length()-1))+result+s2[a-1].substring(1,s2[a-1].length());
	return result;
	}
	public static void main(String[] args) 
	{
		Str9 s9=new Str9();
		System.out.println(s9.hello());

	}
}

