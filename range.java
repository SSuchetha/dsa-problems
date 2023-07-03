class Solution 
{
    public boolean isCovered(int[][] ranges, int left, int right) 
    {
        HashSet<Integer> set=new HashSet<>();
        for(int interval[]:ranges) 
            for(int j=interval[0]; j<=interval[1]; j++)
                set.add(j);
        for(int i=left; i<=right; i++)
            if(!set.contains(i))
                return false;
        return true;
    }
}
