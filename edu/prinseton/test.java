package edu.prinseton;

public class test {
	public static void main(String[] args)
	{
		//int T = 5000000;
		//sierpinksi_triangle(T);
		//sicherman_dice(T);
		StdDraw.setPenRadius(0.01);
		StdDraw.point(0.1, 0.1);
		StdDraw.point(0.9, 0.9);

	}
	public static void sicherman_dice(int T)
	{
		int[] a = {1,3,4,5,6,8};
		int[] b = {1,2,2,3,3,4};
		int[] sum =new int[ StdStats.max(a)+StdStats.max(b)+1];
		int pn=0;
		for(int i=0;i<T;i++)
		{
			sum[a[StdRandom.uniform(6)]+b[StdRandom.uniform(6)]]++;
		}
		//System.out.println(sum.length);
		for(int i=0;i<sum.length;i++)
		{
			if(sum[i]!=0)
				pn++;
		}
		double[] g = new double[pn];
		int f=0;
		for(int i=0;i<sum.length;i++)
		{
			if(sum[i]!=0)
			{
				g[f] =(double) sum[i]/T;
				f++;
				//System.out.println(f);
			}
		}
		StdStats.plotLines(g);
		
		for(int i=0;i<6;i++)
		{
			a[i] = i+1;
			b[i] = i+1;
		}
		int[] sum1 =new int[ StdStats.max(a)+StdStats.max(b)+1];
		pn=0;
		for(int i=0;i<T;i++)
		{
			sum1[a[StdRandom.uniform(6)]+b[StdRandom.uniform(6)]]++;
		}
		for(int i=0;i<sum1.length;i++)
		{
			if(sum1[i]!=0)
				pn++;
		}
		double[] g1 = new double[pn];
		f=0;
		for(int i=0;i<sum1.length;i++)
		{
			
			if(sum1[i]!=0)
			{
				g1[f] =(double) sum1[i]/T;
				f++;
				//System.out.println(f);
			}
		}
		StdStats.plotLines(g1);
	}
	/*
	 * to generate a sierpinksi triangle 
	 * int T indicate the total number of iterations 
	 */
	public static void sierpinksi_triangle(int T)
	{
		//int N=10;
		double[] cx = {0.0 ,1.0 ,0.5};
		double[] cy = {0.0 ,0.0 ,0.866};
		double x = 0.0;
		double y = 0.0;
		for(int i=0;i<T;i++)
		{
			int r = StdRandom.uniform(3);
			x = (x+cx[r])/2;
			y = (y+cy[r])/2.0;
			StdDraw.point(x, y);
			System.out.println(i);
		}
	}
}
