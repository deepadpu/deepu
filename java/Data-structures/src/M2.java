class A 
{
	int i;
	A ref;
}
class M2
{
    public static void main(String[] args) 
	{
		A a1=new A();
		a1.i=10;
		A a2=new A();
		a1.ref=a2;
		a2.i=20;
		A a3=new A();
		a3.i=30;
		a2.ref=a3;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
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