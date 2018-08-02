
public class Recrusion {
	public static void dextobin(int a )
	{
		if(a<0)
		{
			System.out.println("Need to input a pos number!");
			return;
		}
		
		if(a<2&&a>-2)
			System.out.print(a);
		else
		{
			dextobin(a/2);
			System.out.print(a%2);
		}
	}
	public static void dextobin(int a , int bytenum)
	{
		int mo = 0;
		int num =a;
		if(bytenum >4 || bytenum <1)
		{
			System.out.println("bytenum is out of range!");
			return;
		}
		if(a<0)
		{
			mo = 1<< (8*bytenum-1);
			num = mo - a;
		}
		dextobin(num);
		return;
	}
	public static void dextohex(int a) {
		
	}
	public static void run(String[] args) {
		dextobin(-15,2);
	}
}
