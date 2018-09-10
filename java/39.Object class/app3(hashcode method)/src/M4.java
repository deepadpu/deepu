class A 
{
	int i;
	int j;
	int k;
	A(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public int hashCode()//hashcode method got overrided
	{									//i converting to String called hashcode
		String s1 = Integer.toString(i);//attribute value(i) is converting into String.for converint wrapper classes is needed
		String s2 = Integer.toString(j);//attribute value(j) is converting into String
		String s3 = Integer.toString(k);//attribute value(k) is converting into String
		int x = s1.hashCode();//String class also subclass of object class
		int y = s2.hashCode();//inside String class, hashcode method is already overrided
		int z = s3.hashCode();//getting hashcode values from String class(representing as s1,s2,s3) and they are storing in x,y,z
		int hash = x + y + z;
		return hash;
	}
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A(90, 60,30);//value generating based on the content(i.e 90,60,30)
		A a2 = new A(90, 60,30);//value generating based on the content(i.e 90,60,30)
		A a3 = a2;
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
	}
}

//inside string class, hascode class object is not available
//every attribute value is converting into String
//value generating based on the content

//we have to develop one integer number based on the content of  the oject