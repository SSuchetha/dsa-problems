class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        for (int i=0; i<nums.length; i++) 
        {
            if (target!=nums[i])
                continue;
            if (ans[0]==-1)
                ans[0]=i;
            ans[1]=i;
        }
        return ans;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0; i<n; i++)
            nums[i]=sc.nextInt();
        Arrays.sort(nums);
        int t=sc.nextInt();
        int [] res=new int[2];
        res=searchRange(nums,t);
        for(int i=0; i<2; i++)
            System.out.print(res[i]+" ");
    }
}
