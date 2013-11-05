package hashtable;

public class StringNode
{
	private String data, key;
	private StringNode nextNode = null;
	
	public StringNode(String key, String data, StringNode nextNode)
	{
		this.setData(data);
		this.setKey(key);
		this.setNextNode(nextNode);
	}

	public String getData()
	{
		return data;
	}

	public void setData(String data)
	{
		this.data = data;
	}

	public String getKey()
	{
		return key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}

	public StringNode getNextNode()
	{
		return nextNode;
	}

	public void setNextNode(StringNode nextNode)
	{
		this.nextNode = nextNode;
	}
}
