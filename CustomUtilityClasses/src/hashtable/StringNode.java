package hashtable;

public class StringNode
{
	private String value, key;
	private StringNode nextNode = null;
	
	public StringNode(String value, String key, StringNode nextNode)
	{
		this.setData(value);
		this.setKey(key);
		this.setNextNode(nextNode);
	}

	public String getValue()
	{
		return value;
	}

	public void setData(String value)
	{
		this.value = value;
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
