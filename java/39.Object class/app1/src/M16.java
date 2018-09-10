class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M16
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = new A(90);
		A a3 = a1;
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
		System.out.println(a1.i == a2.i);//it is not comparing the references, it's comparing the values
	}
}
//a1 and a2 both are pointing to different objects
//a1 and a3 are pointing to same object
//"==" operator checking the references
//for comparing the two objects content, use == between attributes , not between references