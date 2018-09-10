class A 
{
	int i;
	int j;
	A(int i , int j)
	{

		this.i = i;// i = 10(a1.i); i = 20(a1.i)
		this.j = j;// j = 100(a2.j); j = 200(a2.j)
	}
	public String toString()//overriding toString method
	{
		return "(i =" + i + ", j =" + j + ")";//returning i and j values which are initialized from constructer
	}					
}
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A(10,20);
		A a2 = new A(100,200);
		System.out.println(a1);
		System.out.println(a2);
	}
}
//inside String we are composing i and j value
//i and j are initializing in constructer
//this.i means a1.i for first object and a2.i for second object
//this.j means a1.j for first object and a2.j for second object
//while printing a reference varaible , we are calling the toString method, it is returning the content