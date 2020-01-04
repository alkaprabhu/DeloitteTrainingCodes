public class StringReverse {
	String revStr(String str)
	{
	
		String revFinal="";
		
		String[] splitt=str.split(" ");
		for(int i=0;i<splitt.length;i++)
		{
			
			String s=splitt[i];
			String revWord="";
			for(int j=s.length()-1;j>=0;j--)
			{
				revWord=revWord+s.charAt(j);
			}
			revFinal=revFinal+revWord+" ";
		}
		
		return revFinal;
	}
public static void main(String[] args) {
	test t=new test();
	String res=t.revStr("hello java");
	System.out.println(res);
	
}
}
