class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int count = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (i<nums.length-1&&nums[i]==nums[i + 1])
                continue;
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
    public static void main(String [] args)
    {
      int[] nums = [0,0,1,1,1,2,2,3,3,4]; 
      int[] expectedNums = [0,1,2,3,4]; 
      int k = removeDuplicates(nums); 
      assert k == expectedNums.length;
      for (int i = 0; i < k; i++) {
          assert nums[i] == expectedNums[i];
    }
}
