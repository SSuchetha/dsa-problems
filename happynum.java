class Solution 
{
    public boolean isHappy(int n) 
    {
        int num=n,sum=0;
        HashSet<Integer> set=new HashSet<>();
        while(set.add(n))
        {
            if(n==1)
                return true;
            while(n>0)
            {
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            n=sum;
            sum=0;
        }
        
        return false;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isHappy(n))
            System.out.println("Happy");
        else
            System.out.println("Not happy");
    }
}
