class Solution 
{
    public int firstUniqChar(String s) 
    {
        if (s == null || s.length() == 0) 
            return -1;
        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) 
            charCounts[s.charAt(i)-'a']++;                    
        for (int i = 0; i < s.length(); i++) 
            if (charCounts[s.charAt(i) - 'a'] == 1) 
                return i;
        return -1;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=firstUniqChar(s);
        System.out.println(ans);
    }
}
