package helloworld;

public class Container {
	Object [] items;
	int size;
	
	public ContainerIterator iterator()
	{
		System.out.println("running CI->iterator ");
		return new ContainerIterator (this);
	}
	
	public void add(String str)
	{
		items[size+1] = str;
		size++;
		return;
	}
	public static void main(String[] args)
	{
		Container v = new Container();
		System.out.println("running container.main ");
		
		v.add("123");
		
		
		ContainerIterator itr = v.iterator();
		
		System.out.println(itr.hasNext());
	}
}
