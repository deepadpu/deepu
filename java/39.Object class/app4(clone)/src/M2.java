class A //implements Cloneable
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	void performClone()//our own method developed for calling inherited clone method as clone method should be called inthe subclass itself
	{
		A a2 =  clone();//clone method return type is obj type but we are assinning it to A
		//right side is object type , left hand side is  A class type  ,downcasting is required
		System.out.println(a2.i);
	}
}
class M2 // throws CloneNotSupportedException
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.performClone();//calling our own developed method
		System.out.println("done");
	}
}
//clone method called in the subclass itself
//clone method should be used within the class A
//clone method return type is obj type but we are assinning it to A
//here casting is not proper
