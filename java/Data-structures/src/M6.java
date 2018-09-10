class A 
{
	int i;
	A ref;
	A(int i)
	{
		this.i=i;
	}
	A(int i, A root)
	{
		this.i=i;
		A current=root;
		while(current.ref!=null)
		{
	    current!=current.ref;
		}
		current.ref=this;
	}
}
class M6
{
    public static void main(String[] args) 
	{
		A a1=new A(10);
		new A(20,a1);
		new A(30,a2);
		new A(40,a3);
		new A(50,a4);
		System.out.println(a1.i);
		System.out.println(a1.ref.i);
		System.out.println(a1.ref.ref.i);
		System.out.println(a1.ref.ref.ref.i);
		System.out.println(a1.ref.ref.ref.ref.i);
	}
}
/* o/p:10
20
30
40
50
*/