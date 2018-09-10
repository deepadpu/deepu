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
	void remove(int data)
	{
		if(first.i==data)//removing 1 st element
		{
			first=first.ref;
		}
		else if(last.i==data)
		{
			Node prev=null;
			Node current =first;
			while(current.ref!=null)
			{
				prev=current;
				current=current.ref;
			}
			last=prev;
			last.ref=null;
			
		}

		else
		{
		}
	}
}
class M12
{
    public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.iterate();
		System.out.println("------");
		//list.remove(50);
		list.remove(20);
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