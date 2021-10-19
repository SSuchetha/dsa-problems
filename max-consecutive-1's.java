class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int max = 0;
        int current = 0;
        for (int i : nums) 
        {
            if (i == 1)
                current++;
            else 
            {
                if (current > max) 
                    max = current;
                if (max >= nums.length / 2) 
                    return max;
                current = 0;
            }
        }
        return Math.max(max, current);    
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        int res=findMaxConsecutiveOnes(arr);
        System.out.println(res);
    }
}
