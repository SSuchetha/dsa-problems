/*2085. Count Common Words With One Occurrence
Easy

Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.

Example 1:

Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
Output: 2
Explanation:
- "leetcode" appears exactly once in each of the two arrays. We count this string.
- "amazing" appears exactly once in each of the two arrays. We count this string.
- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
- "as" appears once in words1, but does not appear in words2. We do not count this string.
Thus, there are 2 strings that appear exactly once in each of the two arrays.*/

class Solution 
{
    public int countWords(String[] words1, String[] words2) 
    {
        HashMap<String,Integer> map1=new HashMap<String,Integer>();
        HashMap<String,Integer> map2=new HashMap<String,Integer>();
        for(int i=0; i<words1.length; i++)
        {
            if(map1.containsKey(words1[i]))
                map1.put(words1[i],map1.get(words1[i])+1);
            else
                map1.put(words1[i],1);
        }
        for(int i=0; i<words2.length; i++)
        {
            if(map2.containsKey(words2[i]))
                map2.put(words2[i],map2.get(words2[i])+1);
            else
                map2.put(words2[i],1);
        }
        int count=0;
        for(String word : map1.keySet())
            if(map1.get(word)==1 && map2.containsKey(word) && map2.get(word)==1)
                count++;
        return count;
    }
}
