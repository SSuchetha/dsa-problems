class Solution 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j]) 
                i++;
            else if(nums1[i]>nums2[j]) 
                j++;
            else
            {
                nums1[k++]=nums1[i];
                ++i;
                ++j;
            }
        }
        int ans[]=new int[k];
        for(i=0;i<k;i++)
            ans[i]=nums1[i];
        return ans; 
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int nums1[]=new int[n1];
        int n2=sc.nextInt();
        int nums2[]=new int[n2];
        for(int i=0; i<n1; i++)
            nums1[i]=sc.nextInt();
        for(int i=0; i<n1; i++)
            nums2[i]=sc.nextInt();
        int [] ans=intersect(nums1 , nums2);
        for(int i=0; i<anslength; i++)
            System.out.print(ans[i]+" ");
    }
}
