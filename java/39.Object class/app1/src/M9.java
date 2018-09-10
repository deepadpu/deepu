class A
{
}
class M9
{
	public static void main(String[] args) 
	{

		A a1 = null;
		String s1 = "some thing " + a1;//here toString method is not calling as reference a1 is null to avoid null pointer exception
										//here null only adding to String
		System.out.println(a1);//while printing a1, toString method is not calling(avoiding nullpointer exception)
		System.out.println(s1);
	}
}
//if reference is null, then it won't call toString method
