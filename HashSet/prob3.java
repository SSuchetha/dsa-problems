/*Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.*/

class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int length=0,max_length=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<s.length(); i++)
        {
            set.add(s.charAt(i));
            for(int j=i+1; j<s.length(); j++)
            {
                if(set.contains(s.charAt(j)))
                    break;
                set.add(s.charAt(j));
            }
            length=set.size();
            max_length=Math.max(length,max_length);
            set.clear();
        }
        return max_length;
    }
}
