public class  M22
{
	static class Node//if inner class as a  static main()
	{
	Node left;
	Node right;
	int value;
	public Node(int value)
		{
		this.value=value;
		}
	}
	public static void insert(Node node,int value) 
	{
		if(value < node.value)
		{
			if(node.left!=null)
			{
				insert(node.left,value);//insert() recursively calling
		}
	
			else
		{
		System.out.println("Inserted" +value+ "to left of" + node.value);
		node.left=new Node(value);
		}
	}
	else if(value > node.value)
	{
		if(node.right!=null)
		{
			insert(node.right,value);
		}
		else
		{
         System.out.println("Inserted" + value+ "to right of" + node.value);
		node.right=new Node(value);
		}
	}
}
	public static void printInOrder(Node node)
	{
		if(node!=null)
		{
			printInOrder(node.left);
			System.out.println("Traversed" + node.value);
			printInOrder(node.right);
		}
	}
	public static void main(String[] args)
	{
		Node root=new Node(5);//node object
		insert(root,1);//for insert() required a root and element initially we are creating one node
		insert(root,8);//insert() by supplying a root
		insert(root,6);
		insert(root,3);
		insert(root,9);
		printInOrder(root);
	}
}
/*output:Inserted1to left of5
Inserted8to right of5
Inserted6to left of8
Inserted3to right of1
Inserted9to right of8
Traversed1
Traversed3
Traversed5
Traversed6
Traversed8
Traversed9*/
//one is a value second one is a node
//value is 1 node .value is 5
//new node is creating as a value of 1
//node is pointing to root