class  A
{
	int i;
	int j;
	A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public boolean equals(Object obj)//argument is a2
	{
		return(i == ((A)obj).i && j == ((A) obj).j);
	}
}
class B //inside class B we are developing  a A type member
{
	int m;
	int n;
	A element;//B has a A type element
	B(int i, int j, int m, int n)
	{
		element = new A(i,j); 
		this.m = m;
		this.n = n;
	}
	public boolean equals(Object obj)//argument is a2
	{		//this.element		obj element
		return element.equals(((B)obj).element) && (m == ((B)obj).m && n == ((B) obj).n);
	}//current obj element, argument obj element
}
//
class M6
{
	public static void main(String[] args) 
	{
		A a1 = new A(90,500);
		A a2 = new A(90,500);
		System.out.println(a1.equals(a2));
		B b1 = new B(90,500,30,50);
		B b2 = new B(90,500,30,50);
		System.out.println(b1.equals(b2));
	}
}
//