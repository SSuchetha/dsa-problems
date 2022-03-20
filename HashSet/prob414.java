/*414. Third Maximum Number
Easy

Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
*/

class Solution 
{
    public int thirdMax(int[] nums) 
    {
        //make sure that there r only 3 elements in set
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums)
        {
            set.add(ele);
            if(set.size()>3)
                set.remove(Collections.min(set));
        }
        if(set.size()==3)
            return Collections.min(set);
        return Collections.max(set);
    }
}
