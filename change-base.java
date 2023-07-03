class Solution 
{
    public int sumBase(int n, int k) 
    {
        String n2=String.valueOf(n);
        String num=Integer.toString(Integer.parseInt(n2, 10), k);
        int n1=Integer.parseInt(num);
        int sum=0;
        while(n1>0)
        {
            int rem=n1%10;
            sum+=rem;
            n1/=10;
        }
        return sum;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sum=sumBase(n,k);
        System.out.println(sum);
    }
}
