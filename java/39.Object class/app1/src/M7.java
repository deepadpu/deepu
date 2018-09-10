class A 
{
	int i;
	int j;
	A(int i , int j)
	{

		this.i = i;
		this.j = j;
	}
	public String toString()//overriding toString method
	{
		return "(i =" + i + "," + "j =" + j + ")";
	}					
}
class B extends A//B is subclass to A
{
	int m;
	int n;
	B(int i, int j, int m, int n)
	{
		super(i,j);
		this.m = m;
		this.n = n;
	}
	public String toString()
	{
		return super.toString() + ", m =" + m + ", n =" + n;
	}
	//Super.tostring means A class tostring method
	//it is returning m, n in addition to the superclass return values
}
class M7
{
	public static void main(String[] args) 
	{
		A a1 = new A(10,20);
		A a2 = new A(100,200);
		String s1 = "state of a1:" + a1;//here automaticallly toString() is calling because reference(a1) is added to the String object(s1)
		String s2 = "state of a2:" + a2;//here automaticallly toString() is calling because reference(a2) is added to the String object(s2)
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(s1);
		System.out.println(s2);


		System.out.println("==========================");


		B b1 = new B(10,20, 400,500);
		B b2 = new B(100,200, 30, 35);
		String s3 = "state of b1:" + b1;//here automaticallly toString() is calling because reference(b1) is added to the String object(s3)
		String s4 = "state of b2:" + b2;//here automaticallly toString() is calling because reference(b2) is added to the String object(s4)
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
//initialization taken by respective constructers
//is a relation
