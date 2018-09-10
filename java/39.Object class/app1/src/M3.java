class A 
{
	int i;
}
class M3
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;

		A a2 = a1;

		System.out.println(a1);//a1.tostring();
		System.out.println(a2);//a1.tostring();
	}
}
//a1 and a2 both are pointing to same object
//Object class tostring method
//object content is treated as object state
//here there is only address as a1,a2 pointing to same object
