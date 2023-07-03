class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int k=0;
        for (int i: nums)
        {
            if (i != 0) 
            nums[k++] = i;
            
        }
        for (int j=k; j< nums.length;j++)
            nums[j]=0;
    }
}
