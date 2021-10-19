class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int maxProfit = 0;
        int[] maxArray = new int[n];
        int maxTillNow = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--)
        {
            maxTillNow = Math.max(maxTillNow,prices[i]);
            maxArray[i] = maxTillNow;
        }
        
        for(int i=0; i<n-1; i++)
            maxProfit = Math.max(maxProfit,maxArray[i+1]-prices[i]);
        return maxProfit;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int prices[]=new int[n];
        System.out.println("Enter the prices");
        for(int i=0;i<n;i++)
          prices[i]=sc.nextInt();
        int profit=maxProfit(prices);
        System.out,println(profit);
    }
}
