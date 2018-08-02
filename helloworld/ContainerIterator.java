package helloworld;

public class ContainerIterator {
	private int count=0;
	private Container container;
	
	ContainerIterator (Container c)
	{
		container = c;
		System.out.println("running containeriterator ");
	}
	public void add(Container c)
	{
		count++;
	}
	public boolean hasNext()
	{
		System.out.println("running containeriterator.hasNext ");
		return count<container.size;
	}
}
