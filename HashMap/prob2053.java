/*2053. Kth Distinct String in an Array

A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.

Example 1:

Input: arr = ["d","b","c","b","c","a"], k = 2
Output: "a"
Explanation:
The only distinct strings in arr are "d" and "a".
"d" appears 1st, so it is the 1st distinct string.
"a" appears 2nd, so it is the 2nd distinct string.
Since k == 2, "a" is returned. */

class Solution 
{
    public String kthDistinct(String[] arr, int k) 
    {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int count=0;
        String c="";
        for(String letter : arr)
        {
            if(map.get(letter)==1)
                count++;
            if(count==k)
            {
                c=letter;
                break;
            }
        }
        return c;
    }
}

//Time complexity is O(N)
