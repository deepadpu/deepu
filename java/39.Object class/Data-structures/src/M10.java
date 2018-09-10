class A 
{
	int i;
	A ref;
	A last;
	A(int i)
	{
		this.i=i;
	}
	void add(int i)
	{
		A element=new A(i);
		if(ref==null)
		{
			last=ref=element;
		}
		else
		{
			last.ref=element;
			last=element;
		}
	}
	
	void iterate()
	{
		A current=this;
		while(current !=null)
		{
			System.out.println(current.i);
			current=current.ref;
		}
	}
}
class M10
{
    public static void main(String[] args) 
	{
		A a1=new A(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.iterate();
	}
		
	
}
/*o/p:10
20
30
40
50
*/
	
/* o/p:E:\Data-structures\classes>java M9
Exception in thread "main" java.lang.NullPointerException
        at A.add(M9.java:13)
        at M9.main(M9.java:34)
*/