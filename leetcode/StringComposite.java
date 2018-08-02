package leetcode;

import java.util.ArrayList;

public class StringComposite {
	public static String TESTSTR = "1a2bcDD";
	public static void main(String[] args)
	{
		int a = 0;
		ArrayList<Integer> ia = new ArrayList<Integer>();
		ia.add(a);
		System.out.println(ia.size());
		//run(TESTSTR);
	}
	public static int[] GenBitMap(int num)
	{
		//System.out.println(num);
		int[] a = new int[1<<num];
		return a;
	}
	public static void run(String str)
	{
		int countofchar = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>'9' || str.charAt(i)<'0' )
				countofchar ++;
			if(str.charAt(i)>'a' && str.charAt(i)<'z')
				str.charAt(i) -= (char)(97-65);
		}
		System.out.println(str);
		int map = GenBitMap(countofchar);
		GenOutput(map,str);
	}
	public static void GenOutput(int[] map , String str)
	{
		System.out.println(map.length);
	}
	public static void GenOutput(int map , String str)
	{
		for(int i=0;i<map;i++)
			for(int j=0;j<str.length();j++)
			{
				String tempstr="";
				if(str.charAt(j)<'0'||str.charAt(j)>'9')
			}

	}
}
