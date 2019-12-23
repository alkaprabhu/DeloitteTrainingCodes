//java program to reverse a string and count the no. of vowels and consonants
import java.util.*;
import java.lang.String;
class Test
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str; 
		int vowCount=0;
		int slen;
		String rev="";
		System.out.println("Input the string:");
		str=scan.nextLine();
		slen=str.length();
		for(int i=0;i<slen;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowCount+=1;
			}
		}
		String str2=str.trim();
		int len=str2.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev+" ,the given string contains "+vowCount+" vowels and "+(slen-vowCount)+" consonants");
	}

}