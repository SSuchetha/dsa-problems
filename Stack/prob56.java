/*56. Merge Intervals

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].*/

class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        if(intervals.length==1)
            return intervals;
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        Stack<int[]> stack=new Stack<>();
        stack.add(intervals[0]);
        for(int i=1; i<intervals.length; i++)
        {
            int [] pre=stack.peek();
            int [] cur=intervals[i];
            if(pre[1]<cur[0])
                stack.add(cur);
            else
                pre[1]=Math.max(cur[1], pre[1]);
        }
        return stack.toArray(new int[stack.size()][2]);
    }
}
