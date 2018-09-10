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
class B 
{
	int m;
	int n;
	A element;//element is global attribute in B 
	B(int m, int n)
	{
		this.m = m;
		this.n = n;
	}
	public boolean equals(Object obj)//argument is a2
	{					//this.element			arg element
		boolean status = (element == null ? (((B)obj).element == null ? true : false) :
			(((B)obj).element == null ? false : //these 2 lines checking for this.element and arg element is null or not
			element.equals(((B)obj).element))) && (m == ((B)obj).m && n == ((B)obj).n);
		return status;
	}
}
class M8
{
	public static void main(String[] args) 
	{
		A a1 = new A(90,500);
		A a2 = new A(90,500);
		System.out.println(a1.equals(a2));
		B b1 = new B(30,50);
		B b2 = new B(30,50);
		B b3 = new B(30,50);
		b2.element = a2;
		b1.element = a1;
		System.out.println(b1.equals(b2));//not null, not null=checking further in status of equals method
		System.out.println(b1.equals(b3));//b1.element equals(b3.element)
		System.out.println(b2.equals(b3));
		System.out.println(b3.equals(b1));
	}//if both are null it returns null
}
//if element is null,we should not call equals method to avoid null pointer exception
//b3.element is null
//b2.element is not null
//b1.element is null