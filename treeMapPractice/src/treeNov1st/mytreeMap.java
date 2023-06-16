package treeNov1st;

public class mytreeMap {

	Node root;
	// int size=0;
	int index = 0;

	// int size=0;
	public void add(int data)
	{
		if (root == null) 
		{
			root = new Node(data);
			// size++;
		}
		else
		{
			Node temp = root;
			while (true) 
			{
				if (temp.data == data)
					break;
				else if (data < temp.data && temp.left == null)
				{
					temp.left = new Node(data);
					// size++;
					break;
				} 
				else if (data < temp.data && temp.left != null) 
				{
					temp = temp.left;

				} 
				else if (data > temp.data && temp.right == null) 
				{
					
					temp.right = new Node(data);
					// size++;
					break;
				} 
				else if (data > temp.data && temp.right != null)
				{
					temp = temp.right;
				}
			}
		}
	}

	public int[] toArray() 
	{
		if (root == null)
			return new int[0];
		int arr[] = new int[size()];
		int index = 0;
		addElementInArray(arr, root);
		return arr;

	}

	private void addElementInArray(int[] arr, Node temp) {

		if (temp.left != null)
			addElementInArray(arr, temp.left);
		arr[index++] = temp.data;
		if (temp.right != null)
			addElementInArray(arr, temp.right);
	}

	public int size()
	{
		if (root == null)
			return 0;
		else
		{
			int size = count(root);
			return size;
		}
	}

	private int count(Node temp)
	{
		int size = 1;
		if (temp.left != null)
			size = size + count(temp.left);
		if (temp.right != null)
			size = size + count(temp.right);
		return size;
	}

	public boolean contain(int data)
	{

		if (root == null)
			return false;
		else
		{
			Node temp = root;
			while (true)
			{
				if (temp.data == data)
					return true;
				else if (data < temp.data && temp.left != null)
					temp = temp.left;
				else if (data > temp.data && temp.right != null)
					temp = temp.right;

				else if (data < temp.data && temp.left == null)
					return false;
				else if (data > temp.data && temp.right == null)
					return false;
			}
		}
	}

	public void clear()
	{
		root = null;
	}

	public boolean isEmpty() 
	{
		if (root == null)
			return true;
		return false;
	}

	String s = "";

	public String toString()
	{
		if (root == null)
			return s;
		Node temp = root;
		return printString(temp);
	}

	private String printString(Node temp)
	{
		if (temp.left != null)
			printString(temp.left);
		s = s + temp.data + " ";
		if (temp.right != null)
			printString(temp.right);

		return s;
	}

	public void print()
	{
		printmyNode(root);

	}

	private void printmyNode(Node Node)
	{

		if (Node.left != null)
			printmyNode(Node.left);
		System.out.println(Node.data + " ");
		if (Node.right != null)
			printmyNode(Node.right);

	}

}
