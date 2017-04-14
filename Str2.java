package package1;

public class Str2 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("mark");
		StringBuffer s2=new StringBuffer("kkte");
		int a=s1.length();
		int b=s2.length();
		char c=s1.charAt(a-1);
		char d=s2.charAt(0);
		if( c==d){
			s2.delete(0,1);
			System.out.println(s1.append(s2));
		}
		else
			System.out.println(s1.append(s2));
	}

}
