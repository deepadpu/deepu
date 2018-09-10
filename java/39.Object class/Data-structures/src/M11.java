class Node//data member and reference
{
	int i;
	Node ref;
	Node (int i)
	{
		this.i=i;
	}
}
class LinkedList 
{
	Node first;
	Node last;
	void add(int i)
	{
		Node element=new Node(i);
		if(first == null)
		{
			first=element;
		}
		else
		{
			last.ref=element;
		}
		last =element;
	}
		
	void iterate()
	{
		Node current=first;
		while(current !=null)
		{
			System.out.println(current.i);
			current=current.ref;
		}
	}
}
class M11
{
    public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.iterate();
	}
	
}
/*o/p:20
30
40
50
60
70
80
*/
	
//1st is using for reading purpose
//last elementusing for adding purpose