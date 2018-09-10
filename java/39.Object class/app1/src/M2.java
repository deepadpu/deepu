class A 
{
	int i;
}
class M2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;

		A a2 = new A();
		a2.i = 20;

		System.out.println(a1);//a1.toString();toString() method returning memory address of the object A
		System.out.println(a2);//a2.toString();toString() method returning memory address of the object A
	}
}
//here we are not printing the state of the object, we are printing the memory of the object
//here we get two different outputs as we are printing reference of two different objects whose memory address is different
//the output is memory adddress of object
//toString() method returning memory address of object
//state is value of the attriutes but we are not printing the state  of the object, we are printing the memory address