package RotationCalculate;

public class Point2Point {
	public static int x1;
	public static int x2;
	public static int y1;
	public static int y2;
	public static void main(String[] args)
	{
		String str = "{0,0,0,0}";
		for(int i=0;i<360*201;i++)
		{
			System.out.print(str+", ");
			if(i%201 == 0)
				System.out.println(" ");
		}
	}
}
