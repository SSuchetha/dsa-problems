/*7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321*/

class Solution 
{
    public int reverse(int x) 
    {
        int num=0;
        long ans=0;
        if(x<0)
            num=x*(-1);
        else
            num=x;
        while(num>0)
        {
            int r=num%10;
            ans=ans*10+r;
            num/=10;
        }
        if(ans>Integer.MAX_VALUE)
            return 0;
        if(x<0)
            return (int)ans*(-1);
        return (int)ans;
    }
}
