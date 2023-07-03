class Solution 
{
    public int bitwiseComplement(int N) 
    {
		String result = "";
		String bin = Integer.toBinaryString(N);
		for (char c:bin.toCharArray())
        {
   			 if(c=='1') 
                 result = result+0;
   			 else 
                 result = result+1;
		}
		return Integer.parseInt(result,2);
    }
}
