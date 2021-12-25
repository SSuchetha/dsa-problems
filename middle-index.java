/*

Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

*/

class Solution 
{
    public int findMiddleIndex(int[] nums) 
    {
        int n=nums.length;
        for(int i=1;i<n;i++)
            nums[i]+=nums[i-1];
        
        for(int i=0;i<n;i++)
        {
            int x=(i!=0)?nums[i-1]:0;
            int y=nums[n-1]-nums[i];
            if(x==y)
                return i;
        }
        return -1;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0; i<n; i++)
            nums[i]=sc.nextInt();
        int middle_index=findMiddleIndex(nums);
        System.out.println(middle);
    }
}
