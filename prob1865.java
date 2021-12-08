/*
You are given two integer arrays nums1 and nums2. You are tasked to implement a data structure that supports queries of two types:

Add a positive integer to an element of a given index in the array nums2.
Count the number of pairs (i, j) such that nums1[i] + nums2[j] equals a given value (0 <= i < nums1.length and 0 <= j < nums2.length).
Implement the FindSumPairs class:

FindSumPairs(int[] nums1, int[] nums2) Initializes the FindSumPairs object with two integer arrays nums1 and nums2.
void add(int index, int val) Adds val to nums2[index], i.e., apply nums2[index] += val.
int count(int tot) Returns the number of pairs (i, j) such that nums1[i] + nums2[j] == tot.
*/

class FindSumPairs 
{
  public FindSumPairs(int[] nums1, int[] nums2) 
  {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for (final int num : nums2)
            count2.merge(num, 1, Integer::sum);
  }

  public void add(int index, int val) 
  {
        count2.merge(nums2[index], -1, Integer::sum);
        nums2[index] += val;
        count2.merge(nums2[index], 1, Integer::sum);
  }

  public int count(int tot) 
  {
        int ans = 0;
        for (final int num : nums1)
            ans += count2.getOrDefault(tot - num, 0);
        return ans;
  }

  private int[] nums1;
  private int[] nums2;
  private Map<Integer, Integer> count2 = new HashMap<>();
}
