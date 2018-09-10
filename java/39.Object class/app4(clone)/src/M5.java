class A implements Cloneable
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	void performClone()
	{
		try
		{
			A a2 = (A) clone();
			System.out.println(a2.i);	
		}
		catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		
	}
}
class M5 
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.performClone();
		System.out.println("done");
	}
}
//here we follow all the 4 rules so compilation and running are very success
//cloneable type objects only eligible to clone