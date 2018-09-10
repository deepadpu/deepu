class  A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public boolean equals(Object obj)//argument is a2.overriding object class equals method
	{
		return(i == ((A)obj).i);//(i ==((A)a2.i);
	}							//downcasting obj to A class as left side i is of A type
}
class M3
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = new A(90);
		System.out.println(a1.equals(a2));
	}
}
//it is advisable to overide equals method of object class
//i means a1.i,, this.i means a1.i
//we are using == b/w primitives but not b/w references
//checkilng a1.i with a2.i
//insdie equals this is a1
//onside obj class it is worrying  about the memory but not on conent so we overrided equals method in order to check the content of the  objects
