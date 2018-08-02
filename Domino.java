
public class Domino {
	public int d1;
	public int d2;

	public Domino() {
		d1=d2=0;
	}
	public Domino(int d1 , int d2) {
		int temp=0;
		if(d1>0 && d1<7)
			this.d1=d1;
		else 
			this.d1=0;
		
		if(d1>0 && d1<7)
			this.d2=d2;
		else
			this.d2=0;
		if(this.d1>this.d2) {
			temp = this.d1;
			this.d1 = this.d2;
			this.d2 = temp;
		}
	}

	public int getLeftDots() {
		return d1;
	}
	public int getRightDots() {
		return d2;
	}	
	@Override
	public String toString() {
		return ("(" + d1 +" , "+d2 +")");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Domino");
		Domino domino = new Domino();
		System.out.println(domino.toString());
		Domino dxx = new Domino(1,3);
		System.out.println(dxx.toString());
		System.out.println(dxx.getLeftDots());
		System.out.println(new Domino(4,1).toString());
	}

}
