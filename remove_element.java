class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int count=0;
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
            if(nums[i]!=val)
            {
                nums[count++]=nums[i];
            }
        }
        return count;
    }
    public static void main(String [] args)
    {
        int[] nums = [...]; 
        int val = ...; 
        int[] expectedNums = [...]; 
        int k = removeElement(nums, val); 
        assert k == expectedNums.length;
        for (int i = 0; i < actualLength; i++) 
            assert nums[i] == expectedNums[i];
    }
}
