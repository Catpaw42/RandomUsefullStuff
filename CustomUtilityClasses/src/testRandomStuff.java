import java.util.Arrays;



public class testRandomStuff
{
	public static String[] doStuff()
	{
		String[] temp = Arrays.copyOf(doMore(), 3 + 3);
		String[] second = {"four", "five", "six"};
		System.arraycopy(second, 0, temp, 3, second.length);
		
		return temp;
	}
	
	public static String[] doMore()
	{
		String[] s = {"one", "two", "three"};
		return s;
	}
	
	public static void printStuff(String...stuff){
		for (int i = 0; i < stuff.length; i++)
		{
			System.out.println(stuff[i]);
		}
	}
	
	public static void main(String[] args)
	{
		printStuff(doStuff());
	}
}
