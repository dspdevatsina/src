package RotationCalculate;

import edu.prinseton.StdDraw;

public class RotationCalculate {
	public static double thetastep = 15.0;
	public static int cycle = 360;
	final public static double PI = Math.PI;
	public static int dimension = 401;           //���ĵ���200,200�����Ͻ���0,0
	public static int d = 1;                  //LED�Ƶļ��
	public static int LEDlen = 201;              //LED�Ƶĸ������뾶��201
	public static void main(String[] args)
	{
		int thetanum =(int) ((double)cycle / thetastep);  //һ��������ٸ��Ƕȵ�����
		
		double angle = (2*PI)*180/360;
		for(int j = 0;j<cycle;j+=(int)thetastep)
		{
			Point2Point[] pp = new Point2Point[LEDlen];
			angle = (2*PI)*j/360;
			for(int i = 0; i<LEDlen;i+=d)
			{
				pp[i].x1 = (int)(i*Math.sin(angle))+dimension/2;
				pp[i].y1 = (int)(i*Math.cos(angle))+dimension/2;
				if(pp[i].x1 == dimension/2 ) pp[i].x2 = pp[i].x1;
				else 			   pp[i].x2 = pp[i].x1 - 1;
				
				if(pp[i].y1 == dimension/2 ) {pp[i].y2 = pp[i].y1;}
				else 			   pp[i].y2 = pp[i].y1 - 1;
				System.out.println(" x1="+pp[i].x1+" ,y1="+pp[i].y1+" ,x2="+pp[i].x2+" ,y2="+pp[i].y2);
				StdDraw.setPenRadius(0.005);
				StdDraw.point(f1(pp[i].y1), f1(pp[i].x1));
				StdDraw.text(0.1, 0.1, "angle="+j);
			}
			
			try {
				Thread.sleep(1000); //1000 ���룬Ҳ����1��.
				} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
				}
			StdDraw.clear();
		}
	}
	public static double f1(int a)//��һ����ʾ
	{
		//System.out.println((double)a/dimension);
		return ((double)a/dimension);
	}
}
