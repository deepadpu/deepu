class A 
{
	static A obj;
	protected void finalize()//overriding finalize method of object class
	{
		
		obj = this;//this means current object//"this" means a1;obj = a1;resuructed
		System.out.println("from finalize()");
	}
}
class M3
{
	public static void main(String[] args) 
	{
		System.out.println("1:" + A.obj);
		A a1 = new A();
		System.out.println("a1:" + a1);//object reference is printing
		a1 = null;
		Runtime.getRuntime().gc();//calling gc
		try
		{
			Thread.sleep(10);//main thread sleeping for 10ms(optional)
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("2:" + A.obj);//here A.obj = a1;


		A obj = null;//resuructed become abandoded and removed from memory
		Runtime.getRuntime().gc();//calling gc
		try
		{
			Thread.sleep(10);//main thread sleeping for 10ms(optional)
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("3:" + A.obj);//A.obj is null as it is removed from the memory

	}
}
//