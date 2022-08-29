//Given a set of N lines of English language, each comprises only of a-z and A-Z. For each line, find the alphabets which have highest frequency of occurance and print 
//them

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String [] arr=new String[n];
	    for(int i=0; i<n; i++)
	        arr[i]=sc.nextLine();
	    HashMap<Character, Integer> map=new HashMap<>();
	    for(int i=0; i<n; i++)
	    {
	        int l=arr[i].length();
	        for(int j=0; j<l; j++)
	        {
	            if(arr[i].charAt(j)==' ')
	                continue;
	            if(map.containsKey(arr[i].charAt(j)))
	                map.put(arr[i].charAt(j), map.get(arr[i].charAt(j))+1);
	            else
	             	map.put(arr[i].charAt(j), 1);
	        }
	        int val=Collections.max(map.values());
	        for(Map.Entry<Character, Integer> e : map.entrySet())
	            if(e.getValue()==val)
	                System.out.println(e.getKey());
	        map.clear();
	    }
	}
}
