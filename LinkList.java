public class LinkList{
	public Node first;
	
	public LinkList() {
		this.first = null;
	}
	
	public void AddNode(int data) {
		Node node = new Node(data);
		System.out.println("AddNode"+data);
		System.out.println("this.data" + node.data);
	}
	
	
}
