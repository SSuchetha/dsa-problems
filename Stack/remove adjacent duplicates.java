class Solution
{
    public String removeDuplicates(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==c)
                stack.pop();
            else
                stack.add(c);
        }
        String str="";
        while(!stack.isEmpty())
        {
            str=stack.pop()+str;
        }
        return str;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.next();
        String res=removeDuplicates(s);
        System.out.println(res);
    }
}
