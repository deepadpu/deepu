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
		int hash = s1.hashCode();
		hash += s2.hashCode();
		hash += s3.hashCode();
		hash += s4.hashCode();
		return hash;
	}
}
class M6
{
	public static void main(String[] args) 
	{
		A a1 = new A(90, 80, 70, 100.8);//value generating based on the content(i.e 90, 80, 70, 100.8)
		A a2 = new A(70, 80, 90, 100.8);//value generating based on the content(i.e 70, 80, 90, 100.8)
		A a3 = new A(90, 80, 170,100.8);//value generating based on the content(i.e 90, 80, 170,100.8)
		A a4 = new A(90, 170,80, 100.8);//value generating based on the content(i.e 90, 170,80, 100.8)
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
	}
}

//inside string class hascode class object is not available
//every attribute value is converting into String
//value generating based on the content
//if one attribute value is changed then the entire hashcode value is changed
//hashcode is generating based on the content of the object

//we get first two same value and next two value same
//while overriding the hashcode it is not worrying the order, it considers the overall value
//hashcode method is  more effive on identifying the     when compare to equals methods
//hashcode method is better than the equals method
//equals method compares individually(less performance , more accuracy)
//hashcode method compares overall(more performance, less accuracy)
//hashcode  fails only in one scenario
//hashcode fails in identifying equalities
//hashcode works fine in identifying inequalities
//a1 hashcode not same as a4
//while comparing two hashcode if we find same values then only call equals, if not, it is not require to call equals method
//if hascode is failed then only approach equals method