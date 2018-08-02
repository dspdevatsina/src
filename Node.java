public class Node{
	protected int data;
	protected Node next;
	
	public  Node(int data) {
		this.data = data ;
		System.out.println( "this.data" + data );
	}
	
	public void disp_Node() {
		System.out.println( "this.data" );
	}
}
