class A //implements Cloneable
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	void performClone()//our own method developed for calling inherited clone method as clone method should be called inthe subclass itself
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
class M4 
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.performClone();
		System.out.println("done");
	}
}
//we can't call a clone methd straight away without try-catch  or throws
//obj of A is not eligible for clonning operation so we get error(use impelemnts cloneable) as it is not implementing with Cloneable

