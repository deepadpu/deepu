class B implements Cloneable 
{
	int i ;
	public static void main(String[] args) throws CloneNotSupportedException
	{



		B obj1 = new B();
		obj1.i = 90;

		B obj2 = (B) obj1.clone();//downcasting to B as clone is superclass method
		System.out.println(obj2.i);
	}
}
//original object i value is '90'

//calling clone method Of B class which ecver inheritng and used within  the B
//as clone methd is protected it should be called with in the class
//calling clone method of B within B
//B elements ara eigible for clonnong as B class is impleemnted with cloenble(here B is clonable type )
//Be default objects are not cloneable
//only clonabe type class objects are cloneable