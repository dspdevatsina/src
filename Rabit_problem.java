/**
 * 
 * @author scottma
 *�}Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3����(BornInterval)��ÿ����
 *����һ�����ӣ�С���ӳ����������º�ÿ��������һ
�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
 */
public class Rabit_problem {
	public  void Rabit_problem(int TotalMonths,int BornInterval) {
		int CurrentMonth=0;
		int [] NumOld = new int[TotalMonths];
		int TotalNum=1;
		System.out.println("Rabbit class founded");
		System.out.println("TotalMonths="+TotalMonths);
		
		//cal fabonaci queue
		for(int i=0;i<TotalMonths;i++)
		{
			if(i<2) {NumOld[i]=1;continue;}
			NumOld[i]=NumOld[i-1]+NumOld[i-2];
		}
		
		
		for(CurrentMonth=0;CurrentMonth<TotalMonths;CurrentMonth++)
		{
			if(CurrentMonth<BornInterval) {TotalNum = 1;System.out.println("Numbers in "+(CurrentMonth+1)+"Month="+(TotalNum));continue;}
			TotalNum += NumOld[CurrentMonth-BornInterval];
			if(TotalNum<0) {System.out.println("error , Flow out");break;}
			System.out.println("Numbers in "+(CurrentMonth+1)+"Month="+(TotalNum));
		}
		return;
	}

}
