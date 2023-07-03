import java.util.*;
public class Solution 
{
	public int numSetBits(long a) 
	{
		int b=(int)a;
		int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((b & mask) != 0) {
                bits++;
            }
            b >>= 1;
        }
        return bits;
	}
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    int res=numSetBits(a);
    System.out.println(res);
  }
}
