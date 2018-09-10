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
	boolean remove(int data)
	{
		boolean status=false;
		if(first.i==data)//removing 1 st element
		{
			first=first.ref;
			status=true;
		}
		
		else if(last.i==data)
		{
			Node prev=null;
			Node current=first;
			while(current.ref!=null)
			{
				prev=current;
				current=current.ref;
			}
			last=prev;
			last.ref=null;
			status=true;
			
		}

		else
		{
			Node prev=null;
			Node current=first;
			while(current !=null && !(status=!(current.i !=data)));
			{
				prev=current;
				current=current.ref;
			}
			if(status)
			{
			prev.ref=current.ref;
			}
		}
			return status;
	}
	boolean set(int data, int newData)
	{
		Node current=first;
		boolean status=false;
		while(current  !=null)
		{
			if(current.i==data)
			{
				current.i=newData;
				status=true;
				break;
			}
			current=current.ref;
		}
		return status;
	}
	void swap(int data1 , int data2)
	{
		Node n1, n1Next, n1Prev, n2, n2Next ,n2Prev;
		n1 = n1Next = n2 = n2Next = n1Prev = n2Prev =null;
		Node current = first;
		if(first.i==data2 || last.i == data1)
		{
			data2 = data1 + data2;
			data1 = data2 - data1;
			data2 = data2 - data1;
		}
		while(current !=null)
		{
		if(current.i ==data1)
			{
				n1 = current;
				n1Next = current.ref;
				break;
			}
			n1Prev = current;
			current = current.ref;
		}
	
		current = first;
		while(current !=null)
		{
			if(current.i ==data2)
			{
				n2 = current;
				n2Next = current.ref;
				break;
			}
			n2Prev = current;
			current = current.ref;
		}
		if(first.i==data1)
		{
			if(n1.ref == n2)
			{
				first = n2;
				n2.ref = n1;
				n1.ref = n2Next;
			}
			else
			first=n2;
			n2.ref =n1Next;
			n2Prev.ref = n1;
			n1.ref=n2Next;
		}
		else if(last.i==data2)
		{
			if(n1.ref = n2)
			{
               n1Prev.ref=n2;
			   n2.ref=n1;
			   last = n1;
			   n1.ref = null;
			}
			else
			{
			n1Prev.ref=n2;
			n2.ref=n1Next;
			n2Prev.ref=n1;
			last=n1;
			n1.ref=null;
		}
		else if(first.i==data1 && last.i==data2)
		{
		first=n2;
		n2.ref = n1Next;
		last=n1;
		n2Prev.ref = n1;
		n1.ref = null;
		}
		}
		else if(n1.ref==n2)
		{
			n1Prev.ref=n2;
			n2.ref=n1;
			n1.ref=n2Next;
		}
		else if(n2.ref==n1)
		{
			n2Prev.ref=n1;
			n1.ref=n2;
			n2.ref=n1Next;
		}
		
		else 
		{
		n1Prev.ref=n2;
		n2.ref=n1Next;
		n2Prev.ref=n1;
		n1.ref=n2Next;
		}
	}
}
	

	
class M16
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
		list.add(90);
		list.iterate();
		System.out.println("------");
		//System.out.println(list.remove(130));
		//list.remove(50);
		//list.remove(20);
		//System.out.println(list.set(40,100));
		//System.out.println(list.set(60,100));
		//list.remove(30);
		list.swap(80,90);
		list.iterate();
	}
}
	
/*o/p

E:\Data-structures\src>java -cp ../classes M16
20
30
40
50
60
70
80
90
------
20
90
40
50
60
70
80
30*/