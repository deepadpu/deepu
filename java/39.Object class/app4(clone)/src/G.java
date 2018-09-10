class A
{
	int x;
	A(int x)
	{
		this.x = x;
	}
}
class G implements Cloneable 
{
	int i ;
	A a1;//not immutable
	protected Object clone() throws CloneNotSupportedException//overriding clone method of object class
	{
		G obj = (G) super.clone();//calls superclass clone method which  we are overriding
		obj.a1 = new A(a1.x);
		return obj;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		G obj1 = new G();
		obj1.i = 90;
		obj1.a1 = new A(10);

		G obj2 = (G) obj1.clone();
		System.out.println(obj2.i);
		System.out.println(obj2.a1.x);
		obj1.i = 190;
		obj1.a1.x = 20;
		System.out.println(obj2.i);
		System.out.println(obj2.a1.x);
	}
}
//G class containing i and a1
//here changes in one ,affecting values in another (it is known as shallow copy operation)
//shallow clonning
//if there is a derived data type attribute and not a immutable then it will be shallow copy operation(shallow cloning)
//main method calling clone method which is overrided