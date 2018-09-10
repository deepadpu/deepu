class A 
{
	int i;
	A ref;
	A(int i)
	{
		this.i=i;
	}
	void add(int i)
	{
		A element=new A(i);
		A current=ref;
		while(current.ref!=null)
		{
	    current=current.ref;
		}
		current.ref=this;
	}
}
class M8
{
    public static void main(String[] args) 
	{
		A a1=new A(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		A current=a1;
		while(current !=null)
		{
		System.out.println(current.i);
		current = current.ref;
		}
	}
}
	
/* o/p:E:\Data-structures\classes>java M8
Exception in thread "main" java.lang.NullPointerException
        at A.add(M8.java:13)
        at M8.main(M8.java:25)
*/