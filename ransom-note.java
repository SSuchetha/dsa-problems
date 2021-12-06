class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int[] count = new int[256];
        for (char c : magazine.toCharArray()) {
            count[c]++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (count[c]-- == 0) return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String r=sc.next();
        String m=sc.next();
        boolean ans=canConstruct(r,m);
        System.out.println(ans);
    }
}
