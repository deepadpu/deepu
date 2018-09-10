class A 
{
	int i;
	public String toString()//overriding object class toString method
	{
		return "i="+ i;//String representation encorporating i value
						 // it is returning i value but not memory address
	}					
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		System.out.println(a1);//a1.toString();
	}
}
//printing content of the object or state of the object
//as toString method is returning address of the object, try to override it always.(we are least worrying about memory address)