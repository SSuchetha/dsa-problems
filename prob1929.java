/*1929. Concatenation of Array

Given an integer array nums of length n , you want to create an array ans of length 2n where ans is the concatenation of two nums arrays.

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]*/

class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int [] ans=new int[2*nums.length];
        for(int i=0; i<nums.length; i++)
        {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
