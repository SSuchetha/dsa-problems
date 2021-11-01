package removeKDigits;
import java.util.Scanner;
import java.util.Stack;
public class removeKDigits 
{
	
	public static String remove(String num , int k)
	{
		StringBuilder result=new StringBuilder();
		if(k>=num.length())
			return "0";
		if(k==0)
			return num;
		Stack<Character> s=new Stack<Character>();
		for(int i=0; i<num.length(); i++)
		{
			char c=num.charAt(i);
			while(!s.isEmpty() && k>0 && s.peek()>c)
			{
				s.pop();
				k--;
			}
			if(!s.isEmpty() || c!='0')
				s.push(c);
		}
		while(!s.isEmpty() && k>0)
		{
			k--;
			s.pop();
		}
		if(s.isEmpty())
			return "0";
		while(!s.isEmpty())
			result.append(s.pop());
		String str=result.reverse().toString();
		return str;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer n");
		int n=sc.nextInt();
		System.out.println("Enter string");
		String str=sc.next();
		int m=str.length();
		System.out.println(remove(str,n));
	}
}
