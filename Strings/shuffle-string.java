class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        StringBuilder ans=new StringBuilder(s);
        for(int i=0; i<s.length(); i++)
            ans.setCharAt(indices[i], s.charAt(i));
        return ans.toString();
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        int [] indices=new int[n];
        for(int i=0; i<n; i++)
            indices[i]=sc.nextInt();
        String ans=restoreString(s,indices);
        System.out.println(ans);
    }
}
