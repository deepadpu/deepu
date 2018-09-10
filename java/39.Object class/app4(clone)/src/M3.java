class A implements Cloneable
{
	int i;
	A(int i)
	{
		this.i = i;
	}					// throws CloneNotSupportedException
	void performClone() 
		//here there should be throws statement or try-catch  as we sare calling clone method
		//our own method developed for calling inherited clone method as clone method should be called inthe subclass itself
	{
		A a2 = (A) clone();//we can't apply a2 to clone method straight away (so we are downcasting)
		System.out.println(a2.i);
	}
}
class M3 // throws CloneNotSupportedException
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.performClone();
		System.out.println("done");
	}
}
//we can't call a clone methd straight away without try-catch  or throws
//

