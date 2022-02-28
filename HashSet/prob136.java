/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1*/

class Solution 
{
    public int singleNumber(int[] nums) 
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(set.contains(nums[i]))
                set.remove(nums[i]);
            else
                set.add(nums[i]);
        }
        return (int) set.iterator().next();
    }
}
