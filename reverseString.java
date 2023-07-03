/*
Reverse the words in a sentence

Example

Input : have a nice day
Output : day nice a have
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String [] arr=str.split(" ");
		int n=arr.length-1;
		for(int i=0; i<arr.length/2; i++)
		{
		    String temp=arr[i];
		    arr[i]=arr[n];
		    arr[n]=temp;
		    n--;
		}
		String res=String.join(" ", arr);
		System.out.println(res);
	}
}
