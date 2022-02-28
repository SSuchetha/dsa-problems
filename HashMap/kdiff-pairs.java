class Solution 
{
    public int findPairs(int[] nums, int k) 
    {
        HashMap <Integer,Integer>store=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(Math.abs(nums[i]-nums[j])==k)
                {
                    if(nums[i]>nums[j])
                        store.put(nums[i],nums[j]);
                    else
                        store.put(nums[j],nums[i]);
                }
            }
        }
        return store.size();
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();
        int count=findPairs(arr,k);
        System.out.println(count);
    }
}
