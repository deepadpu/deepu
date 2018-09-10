class D implements Cloneable 
{
	int i ;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		D obj1 = new D();
		obj1.i = 90;

		D obj2 = (D) obj1.clone();
		System.out.println(obj2.i);
		obj1.i = 190;
		System.out.println(obj1.i);
	}
}
//original object i value is '90'
//if we modify the clone object value after cloninng, then it will not effect the original object
//original object and clone object are perfectly independent to each other
//inside object if primitives or immutable are there then cloning will be deep copy operation