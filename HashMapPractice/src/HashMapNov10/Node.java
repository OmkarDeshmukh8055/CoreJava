package HashMapNov10;

public class Node<D1,D2> {

	D1 key;
	D2 value;
	Node next;
	public Node(D1 key,D1 value)
	{ super();
		this.key=key;
		this.value=(D2) value;
	}
}
