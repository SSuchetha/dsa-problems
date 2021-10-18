class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int final_sum = nums[0];
        int temp_sum = nums[0];
        for(int i = 1; i < nums.length; i++) 
        {
            if(temp_sum + nums[i] < nums[i]) 
                temp_sum = nums[i];
            else 
                temp_sum = temp_sum + nums[i];
            if(temp_sum > final_sum) 
                final_sum = temp_sum;
        }
        return final_sum;        
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in)
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int [] nums=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0; i<n; i++)
          nums[i]=sc.nextInt();
        int sum=maxSubArray(nums);
        System.out.println(sum);
    }
}
