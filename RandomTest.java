import java.util.Random;
import java.util.ArrayList;

public class RandomTest {
	public int x;
	private static int MaX_NUM = 10;
	public static void main(String[] args)
	{
		Random r = new Random();
		int[] array = new int[10];

		ArrayList<String> arraylist = new ArrayList<String>();
		for(int i=0;i<10;i++)
			arraylist.add("hello"+i);
		arraylist.remove("hello1");
		for(int i=0;i<arraylist.size();i++)
			System.out.println(arraylist.get(i));
		ArrayList<RandomTest> rtarray = new ArrayList<RandomTest>();
		for(int i=0;i<10;i++)
			rtarray.add(new RandomTest());
		for(int i=0;i<10;i++)
			rtarray.get(i).x = i*i;
		for(int i=0;i<10;i++)
			System.out.println(rtarray.get(i).x);
		getmaxnum();
	}
	public static void getmaxnum()
	{
		System.out.println("MaX_NUM="+MaX_NUM);
	}
	
}
