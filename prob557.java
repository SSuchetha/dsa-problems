/*557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"*/

class Solution 
{
    public String reverseWords(String s) 
    {
        String [] arr=s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0; i<arr.length; i++)
        {
            sb.append(new StringBuffer(arr[i]).reverse().toString()+" ");
        }
        String ans=sb.toString().trim();
        return ans;
    }
}
