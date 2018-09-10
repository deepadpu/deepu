class C implements Cloneable 
{
	int i ;
	public static void main(String[] args) throws CloneNotSupportedException
	{


	
		C obj1 = new C();
		obj1.i = 90;

		C obj2 = (C) obj1.clone();
		System.out.println(obj2.i);
		obj1.i = 190;
		System.out.println(obj2.i);
	}
}
//original object i value is '90'
//if we modify the original object value after cloninng , then it will be modified, clone(duplicate) will not be effected

//deep copy operation(original and duplicate both are 100% independent)
//obeject class clone method providing deep copy operation