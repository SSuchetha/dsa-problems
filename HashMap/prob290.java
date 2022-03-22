/*
290. Word Pattern

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
*/

class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
        String [] ss=s.split(" ");
        if(ss.length!=pattern.length())
            return false;
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0; i<pattern.length(); i++)
        {
            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(ss[i]))
                map.put(pattern.charAt(i),ss[i]);
            else
            {
                if(!ss[i].equals(map.get(pattern.charAt(i))))
                    return false;
            }
        }
        return true;
    }
}
