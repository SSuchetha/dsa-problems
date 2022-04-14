/*20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:

Input: s = "()"
Output: true*/

class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(c=='[' || c=='{' || c=='(')
                stack.push(c);
            else
            {
                if((!stack.isEmpty() && stack.peek()=='{' && c=='}') || (!stack.isEmpty() && stack.peek()=='(' && c==')') || (!stack.isEmpty() && stack.peek()=='[' && c==']'))
                    stack.pop();
                else
                    return false;
            }
        }
       return stack.isEmpty();
    }
}
