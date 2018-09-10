class A 
{
	int i;
	int j;
	int k;
	double m;
	A(int i, int j, int k, double m)
	{
		this.i = i;
		this.j = j;
		this.k = k;
		this.m = m;
	}
	public int hashCode()//hashcode method got overrided
	{
		String s1 = Integer.toString(i);//attribute value is converting into String
		String s2 = Integer.toString(j);//attribute value is converting into String
		String s3 = Integer.toString(k);//attribute value is converting into String
		String s4 = Double.toString(m);//attribute value is converting into String
		int hash = s1.hashCode();//calling hashcode based on s1
		hash += s2.hashCode();//calling hashcode based on s2
		hash += s3.hashCode();//calling hashcode based on s3
		hash += s4.hashCode();//calling hashcode based on s4
		return hash;
	}
}
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A(90, 60, 30, 10.5);//value generating based on the content(i.e 90,60,30)
		A a2 = new A(90, 60, 30, 10.5);//value generating based on the content(i.e 90,60,30)
		A a3 = new A(90, 60, 320, 10.5);//value generating based on the content(i.e 90,60,30)
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
	}
}

//inside string class hascode class object is not available
//every attribute value is converting into String
//value generating based on the content
//if one attribute value is changed then the entire hashcode value is changed
//hashcode is generating based on the content of the object