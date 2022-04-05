/*844. Backspace String Compare

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".*/

class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
        Stack<Character> s1=new Stack<Character>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='#' && !s1.empty())
                s1.pop();
            else if(s.charAt(i)=='#' && s1.empty())
                continue;
            else
                s1.push(s.charAt(i));
        }
        
        Stack<Character> t1=new Stack<Character>();
        for(int i=0; i<t.length(); i++)
        {
            if(t.charAt(i)=='#' && !t1.empty())
                t1.pop();
            else if(t.charAt(i)=='#' && t1.empty())
                continue;
            else
                t1.push(t.charAt(i));
        }
        if(s1.equals(t1))
            return true;
        return false;
    }
}
