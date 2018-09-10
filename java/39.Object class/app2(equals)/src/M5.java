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
		return(i == ((A)obj).i && j == ((A) obj).j);//(a1.i == ((A)a2).i && a1.j == ((A) a2).j);
	}//there i means this.i which means a1.i
}
class B extends A
{
	int m;
	int n;
	B(int i, int j, int m, int n)
	{
		super(i,j);
		this.m = m;
		this.n = n;
	}
	public boolean equals(Object obj)//argument is a2
	{
		return super.equals(obj) && (m == ((B)obj).m && n == ((B) obj).n);
	}
}
class M5
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