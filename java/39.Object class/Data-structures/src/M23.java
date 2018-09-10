class BinarySearchTree 
{
	Node root;
	class Node
	{
		int value;
		Node left,right;
		public Node(int value)
		{
			this.value=value;
		}
	}
	void insert(int value)
	{
		root=insertRec(root,value);
	}
	Node insertRec(Node root,int value)
	{
		if(root==null)
		{
			root=new Node(value);
			return root;
		}
		if(value<root.value)
		{
			root.left=insertRec(root.left,value);
		}
		else if(value>root.value)
		{
          root.right=insertRec(root.right,value);
		}
		return root;
	}
	void inorder()
	{
		inorderRec(root);
	}
		void inorderRec(Node root)
	{
		if(root!=null)
		{
			inorderRec(root.left);
			System.out.println(root.value+"");
            inorderRec(root.right);
		}
	}
	void deleteValue(int value)
	{
		root=deleteRec(root,value);
	}
	Node deleteRec(Node root,int value)
	{
		if(root==null)
		{
			return root;
		}
		if(value<root.value)
		{
			root.left=deleteRec(root.left,value);
		}
		else if(value>root.value)
		{
			root.right=deleteRec(root.right,value);
		}
		else
		{
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			root.value=minValue(root.right);
			root.right=deleteRec(root.right,root.value);
		}
		return root;
	}
	int minValue(Node root)
	{
	int minv=root.value;
	while(root.left!=null)
	{
		minv=root.left.value;
		root=root.left;
	}
	return minv;
	}
}
class M23
{
	public static void main(String[] args) 
	{
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		System.out.println("Inorder traversal of the given tree");
		tree.inorder();

		System.out.println("\nDelete 20");
		tree.deleteValue(20);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder();

		System.out.println("\nDelete 30");
		tree.deleteValue(30);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder();

		System.out.println("\nDelete 50");
		tree.deleteValue(50);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder();


	}
}
/*output:Inorder traversal of the given tree
20
30
40
50
60
70
80

Delete 20
Inorder traversal of the modified tree
30
40
50
60
70
80

Delete 30
Inorder traversal of the modified tree
40
50
60
70
80

Delete 50
Inorder traversal of the modified tree
40
60
70
80*/