class A 
{
	int i;
	int j;
	A(int i , int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()//overriding toString method
	{
		return "(i =" + i + "," + "j =" + j + ")";
	}					
}
class M6
{
	public static void main(String[] args) 
	{
		A a1 = new A(10,20);
		A a2 = new A(100,200);
		String s1 = "state of a1:" + a1;//here automaticallly toString() is calling because reference(a1) is added to the String object(s1)
		String s2 = "state of a2:" + a2;//here automaticallly toString() is calling because reference(a2) is added to the String object(s2)
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(s1);
		System.out.println(s2);
	}
}
//while adding any reference variable  to string object, internally calling toString method automatically
//inside A, tostring method got overrided, so we are not getting  memory address, we get state or conent of the object
