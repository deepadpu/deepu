class A 
{
	int i;
	int j;
	int k;
	A(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
}
class M3
{
	public static void main(String[] args) 
	{
		A a1 = new A(90, 60,30);
		A a2 = new A(90, 60,30);
		A a3 = a2;
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
	}
}
//Object class hashcode returning the (memory representation), address representing in integer form
//a1 and a3 are pointing to same object so we get same integer value output for both a1 and a3
//a2 and a3 hashcode is same