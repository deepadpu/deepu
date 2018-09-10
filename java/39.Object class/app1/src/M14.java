class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M14
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = new A(90);
		System.out.println(a1 == a2);
	}
}
//a1 and a2 both are pointing to different objects
//checking referenced varaible.
//there are 2 different objects whose address is different so we get false