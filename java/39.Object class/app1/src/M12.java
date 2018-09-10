class M12 
{
	public static void main(String[] args) 
	{
		class A extends Thread
		{
		}


		A a1 = new A();
		Thread t1 = new Thread();
		System.out.println(a1);
		System.out.println(t1);
	}
}
//in thread class toString method is overrided.so, that overrided method is available in A as class A is extended with thread
//we are getting name of the thread,priority of thread and parent thread
//in all built in classes, wrapper classes toString() method is overrided