class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M1 
{
	public static void main(String[] args)  
	{
		A a1 = new A(90);
		A a2 = a1.clone();
		System.out.println("done");
	}
}
//here A class is not cloeanble type so can't perform clone operation
//as clone is preotected it should not use in another class
//here we are usuing A class clone method in class M1 so we get errror