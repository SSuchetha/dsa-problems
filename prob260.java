/*
260. Single Number III
Medium

Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

Example:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
*/

class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
        HashSet<Integer> set=new HashSet<>();
        int [] res=new int[2];
        for(int i=0; i<nums.length; i++)
        {
            if(set.contains(nums[i]))
                set.remove(nums[i]);
            else
                set.add(nums[i]);
        }
        int index=0;
        for(int ele : set)
        {
            res[index]=ele;
            index++;
        }
        return res;
    }
}
