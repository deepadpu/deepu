class E implements Cloneable 
{
	int i ;//i is primitive
	String s1;//String is immutable
	public static void main(String[] args) throws CloneNotSupportedException
	{
		E obj1 = new E();
		obj1.i = 90;
		obj1.s1 = "abc";

		E obj2 = (E) obj1.clone();
		System.out.println(obj2.i);
		obj2.i = 190;
		obj2.s1 = "xyz";
		System.out.println(obj1.i);
		System.out.println(obj1.s1);
	}
}
//original object i value is '90'
//if we modify the clone object value after cloninng, then it will not effect the original object
//original object and clone object are perfectly independent to each other
//inside object if primitives or immutable are there then we will get deepcopy operation(changes in one not reflecting other)
//wrapper objects are also immutable for some extent.
