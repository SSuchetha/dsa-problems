class Solution 
{
    public int maxDistance(int[] nums1, int[] nums2) 
    {
        int dist=0,max_dist=0,i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]>nums2[j])
                ++i;
            else
            {
                max_dist=Math.max(max_dist , j-i);
                ++j;
            }
        }
        return max_dist;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int [] nums1=new int[m];
        for(int i=0; i<m; i++)
          nums1[i]=sc.nextInt();
        int n=sc.nextInt();
        int [] nums2=new int[n];
        for(int i=0; i<n; i++)
          nums2=sc.nextInt();
        int maxdist=maxDistance(nums1 , nums2);
        System.out.println(maxdist);
    }
}
