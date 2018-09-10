class Node 
{
	int value;
	Node leftChild;
	Node rightChild;
	Node(int value)
	{
		this.value = value;
	}
}
class Tree
{
	Node root;
	public void add(int value)
	{
		Node newNode = new Node(value);
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			Node focusNode = root;
			Node parent;
			while (true)
			{
				parent = focusNode;
				if (value < focusNode.value)
				{
					focusNode = focusNode.leftChild;
					if(focusNode == null)
					{
						parent.leftChild = newNode;
						return;
					}
				}
				else
				{
					focusNode = focusNode.rightChild;
					if (focusNode == null)
					{
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	public void iterate(Node focusNode)
	{
		if(focusNode !=null)
		{
			iterate(focusNode.leftChild);
			System.out.println(focusNode.value);
			iterate(focusNode.rightChild);
		}
	}
}

class M20
{
	public static void main(String[] args) 
	{
		Tree tree = new Tree();
		tree.add(50);
		tree.add(25);
		tree.add(15);
		tree.add(10);
		tree.add(30);
		tree.add(75);
		tree.add(85);
		tree.add(60);
		tree.iterate(tree.root);
	}
}
/*o/p:E:\Data-structures\src>java -cp ../classes M20
10
15
25
30
50
75
85*/