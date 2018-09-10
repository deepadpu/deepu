class A //extends Object(by default every class extends with Object class)
{
	int i;
}
class M1
{
	public static void main(String[] args) 
	{



		A a1 = new A();
		a1.i = 10;
		System.out.println(a1);//a1.toString();
	}
}
//integer reprsentation of memory address
//we get hexadecimal representaiton of memory address
//inside class A ,toString method is available
// all the methods of Object class are inheriting to sub class(means every class as object class is super most class)

//inside class every Object class member is available
//whenever we are trying to print raference, internally it calls OtoString() method of object class which returns memory address of the object
//toString method returns class name@ memory address of the Object in hexadecimal form
