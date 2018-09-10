class A 
{
	int i;
	A ref;
	A(int i)
	{
		this.i=i;
	}
}
class M4
{
    public static void main(String[] args) 
	{
		A a1=new A(10);
		a1.ref=new A(20);
		a1.ref.ref=new A(30);
		a1.ref.ref.ref=new A(40);
		a1.ref.ref.ref.ref=new A(50);
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