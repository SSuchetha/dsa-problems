class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        Arrays.sort(nums);
        int f=0,j,index=0;
        List<Integer> freq=new ArrayList<Integer>(); 
        for(int i=0; i<nums.length; i=i+f)
	    {
		    f=1;
		    for(j=i+1; j<nums.length; j++)
		    {
			    if(nums[i]==nums[j])
				    f++;
		    }	
            if(f>(nums.length/3))
            {
                freq.add(nums[i]);
                index++;
            }  
        }
        return freq;
    }
}
