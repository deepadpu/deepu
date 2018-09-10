class A implements Cloneable
{
	int i = 10;
	int j = 20;
	


		protected Object clone() throws CloneNotSupportedException
		{
			A obj = (A) super.clone();//calls superclass clone method which  we are overriding
			return obj;
		}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		A a1 = new A();
		A a2 = (A)a1.clone();
		a2.i = 30;
		a2.j = 40;

		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println("==================");
		System.out.println(a2.i);
		System.out.println(a2.j);
	}
}
//clone is nothing but developing a duplicate
//original one can be copied through clone
/*cloning can be done through Object class clone() method-"protected Object clone() throws CloneNotSupportedException"
	1. it is protected method
	2. return type is Object(so we have to do down casting)
	3. it throws CloneNotSupportedException(checked exception)
	4. inorder to call clone method on any odject that object should be clonable type
	*/
