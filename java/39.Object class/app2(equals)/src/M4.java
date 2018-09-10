class  A
{
	int i;
	int j;
	A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public boolean equals(Object obj)//inside equals method 'this' is a1 and argument obj is 'a2'
	{
		return(i == ((A)obj).i && j == ((A) obj).j);//a1.i == ((A)a2).j) && a1.j == ((A) a2).j);
	}
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A(90,500);
		A a2 = new A(90,500);
		System.out.println(a1.equals(a2));
	}
}
//it is advisable to overide equals method of object class
//i means a1.i,, this.i means a1.i
//