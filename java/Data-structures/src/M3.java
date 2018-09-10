class A 
{
	int i;
	A ref;
}
class M3
{
    public static void main(String[] args) 
	{
		A a1=new A();
		a1.i=10;
		a1.ref=new A();
		a1.ref.i=20;
		a1.ref.ref=new A();
		a1.ref.ref.i=30;
		System.out.println(a1.i);
		System.out.println(a1.ref.i);
		System.out.println(a1.ref.ref.i);
	}
}
/* o/p:10
20
30
20
30
	*/