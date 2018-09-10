public class M21
{
	static class Node
	{
	 Node left;
	 Node right;
	 int value;
	 public Node(int value)
		{
		 this.value = value;
		}
	}
	public static void insert(Node node,int value)
	{
		if (value < node.value)
		{
			if(node.left != null)
			{
				insert(node.left,value);
			}
			else
			{
				System.out.println(" Inserted "+ value + "to left of " + node.value);
				node.left = new Node(value);
			}
		}
		else if(value > node.value)
		{
			if(node.right != null)
			{
				insert(node.right,value);
			}
			else
			{
				System.out.println(" Inserted "+ value + "to right of " + node.value);
				node. right = new Node(value);
			}
			}
		}

public static void printInOrder(Node node)
	{
	if(node !=null)
		{
		printInOrder(node.left);
		System.out.println(" Traversed " + node.value);
		printInOrder(node.right);
		}
	}
	public static void main(String[] args)
	{
		Node root =new Node(5);
		insert(root,1);
		insert(root,8);
		insert(root,6);
		insert(root,3);
		insert(root,9);
		printInOrder(root);
	}
}

/*o/p:E:\Data-structures\src>java -cp ../classes M21
 Inserted 1to left of 5
 Inserted 8to right of 5
 Inserted 6to left of 8
 Inserted 3to right of 1
 Inserted 9to right of 8
 Traversed 1
 Traversed 3
 Traversed 5
 Traversed 6
 Traversed 8
 Traversed 9*/