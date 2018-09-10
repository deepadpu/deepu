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
class B //B class has A class attribute("has a" relation)
{		//B has A type
	int m;
	int n;
	A obj;//obj is an attribute of A class type
	B(int i, int j, int m, int n)
	{
		obj = new A(i, j);//A obj = new A(i,j);
						  //
		this.m = m;
		this.n = n;
	}
	public String toString()
	{
		return obj + ", m =" + m + ", n =" + n;
	}
	//no need to call super String, as internally obj of A  is calling to toString of A which is returning i and j values
	
}
class M8
{
	public static void main(String[] args) 
	{
		A a1 = new A(10,20);
		A a2 = new A(100,200);
		String s1 = "state of a1:" + a1;
		String s2 = "state of a2:" + a2;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(s1);
		System.out.println(s2);


		B b1 = new B(10,20, 400,500);
		B b2 = new B(100,200, 30, 35);
		String s3 = "state of b1:" + b1;
		String s4 = "state of b2:" + b2;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
//while calling reference to the toString method

