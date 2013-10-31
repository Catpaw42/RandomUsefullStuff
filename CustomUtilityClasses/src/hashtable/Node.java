package hashtable;

public class Node<T>
{
	private T data, key;
	private Node<T> nextNode = null;
	
	public Node(T data, T key, Node<T> nextNode)
	{
		this.setData(data);
		this.setKey(key);
		this.setNextNode(nextNode);
	}

	public Node<T> getNextNode()
	{
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode = nextNode;
	}

	public T getKey()
	{
		return key;
	}

	public void setKey(T key)
	{
		this.key = key;
	}

	public T getData()
	{
		return data;
	}

	public void setData(T data)
	{
		this.data = data;
	}
	
	@Override
	public String toString()
	{
		return data.toString();
	}
}
