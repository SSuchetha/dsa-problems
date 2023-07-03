/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.*/

class Solution 
{
    public boolean isPalindrome(String s) 
    {
        int left=0,right=s.length()-1;
        char leftChar;
        char rightChar;
        while(left<=right)
        {
            leftChar=s.charAt(left);
            rightChar=s.charAt(right);
            if(!Character.isLetterOrDigit(leftChar))
                left++;
            else if(!Character.isLetterOrDigit(rightChar))
                right--;
            else
            {
                if(Character.toLowerCase(leftChar)!=Character.toLowerCase(rightChar))
                    return false;
                left++;
                right--;
            }
        }
        return true;
    }
}
