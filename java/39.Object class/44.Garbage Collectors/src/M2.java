clhass A 
{
	A obj;
	protected void finalize()//overriding finalize method of object class
	{
		System.out.println("from finalize()");
	}
}
class M2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.obj = a2;
		a2.obj = a3;
		a3.obj = a1;
		//a1 = a2 = a3 = null;//all objects are abonded here
		a1 = a3 = null;//objects are not abonded here
		//System.gc();//calling gc
		Runtime.getRuntime().gc();//calling gc
		try
		{
			Thread.sleep(10);//main thread sleeping for 10ms(optional)
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("done");
	}
}
//here object can't be reached from main method
//island of isolation