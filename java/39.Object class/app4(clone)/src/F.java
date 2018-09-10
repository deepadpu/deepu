class A
{
	int x;
	A(int x)
	{
		this.x = x;
	}
}
class F implements Cloneable 
{
	int i ;
	A a1;//not immutable
	public static void main(String[] args) throws CloneNotSupportedException
	{
		F obj1 = new F();
		obj1.i = 90;
		obj1.a1 = new A(10);

		F obj2 = (F) obj1.clone();
		System.out.println(obj2.i);
		System.out.println(obj2.a1.x);
		obj1.i = 190;
		obj1.a1.x = 20;
		System.out.println(obj2.i);
		System.out.println(obj2.a1.x);
	}
}
//F class containing i and a1
//here changes in one ,affecting values in another (it is known as shallow copy operation)
//shallow clonning
//if there is a derived data type attribute and not a immutable then it will be shallow copy operation(shallow cloning)