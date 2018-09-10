import java.util.HashSet;
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
	public String toString()//toString method of object class method overriding
	{
		return "(" + i + "," + j + "," + k + "," + m + ")";
	}
	public int hashCode()//hashcode method of object class got overrided
	{
	
		String s1 = Integer.toString(i);//attribute value is converting into String
		String s2 = Integer.toString(j);//attribute value is converting into String
		String s3 = Integer.toString(k);//attribute value is converting into String
		String s4 = Double.toString(m);//attribute value is converting into String
		int hash = s1.hashCode();//calling hashcode based on s1
		hash += s2.hashCode();
		hash += s3.hashCode();
		hash += s4.hashCode();
		System.out.println("hashCode for :" + this + "is " + hash);
		return hash;
	}
	public boolean equals(Object obj)//overriding equals method of object class
	{
		boolean flag =  (obj instanceof A) && 
						(i == ((A) obj).i) &&
						(j == ((A) obj).j) &&
						(k == ((A) obj).k) &&
						(m == ((A) obj).m);
		System.out.println("equals b/w " + this + " and " + obj + ":" + flag);
		return flag;
	}
}
class M7
{
	public static void main(String[] args) 
	{
		A a1 = new A(90, 80, 170, 100.8);//value generating based on the content(i.e 90, 80, 70, 100.8)
		A a2 = new A(70, 80, 90, 100.8);//value generating based on the content(i.e 70, 80, 90, 100.8)
		A a3 = new A(90, 80, 170,100.8);//value generating based on the content(i.e 90, 80, 170,100.8)
		A a4 = new A(90, 170,80, 100.8);//value generating based on the content(i.e 90, 170,80, 100.8)
		A a5 = new A(90, 170,280, 100.8);//value generating based on the content(i.e 90, 170,80, 100.8)
		A a6 = new A(180, 170,90, 100.8);//value generating based on the content(i.e 90, 170,80, 100.8)
		HashSet set= new HashSet();
		set.add(a1);
		System.out.println("==============");
		set.add(a2);
		System.out.println("==============");
		set.add(a3);
		System.out.println("==============");
		set.add(a4);
		System.out.println("==============");
		set.add(a5);
		System.out.println("==============");
		set.add(a6);
		System.out.println("==============");
		System.out.println(set);
	}
}

//hashset class is a part of collection API
//hashset won't allow duplicates.it won't allow duplicate elements
//to identify duplicate elements, internally it uses hashcode method  and equals method
//hashcode method is less time