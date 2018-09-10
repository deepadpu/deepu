class A 
{
	protected void finalize()//overriding finalize method of object class
	{
		System.out.println("from finalize()");
	}
}
class M1
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1 = null;//making object as abonded
		System.gc();//calling gc
		//Runtime.getRuntime().gc();//calling gc
		System.out.println("done");
	}
}
//System.gc() method internally calls Runtime.getRuntime().gc();
//here gc calls finalize method.the overrided method in Class A is executed
//garbage collection is a back-ground activity
//finalize method is almost last step in object life cycle
//we can override finalize method of object class in it's subclass with same or wider access level
//if we are calling finalize method , we should call it by using a reference variable.as object having reference variable it is 
//live object not abonded object.so it is not eligible for garbage collection