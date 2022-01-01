class Solution 
{
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer,Integer>map=new HashMap();
        map.put(0,-1);
        int count=0,maxLength=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                count--;
            else
                count++;
            if(map.containsKey(count))
                maxLength=Math.max(maxLength , i-map.get(count));
            else
                map.put(count,i);
        }
        return maxLength;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0; i<n; i++)
          nums[i]=sc.nextInt();
        int length=findMaxLength(nums);
        System.out.println(length);
    }
}
