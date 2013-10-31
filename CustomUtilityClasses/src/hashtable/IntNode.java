package hashtable;

public class IntNode
{
	private int dataValue = 0;
	private int key;
	private IntNode next = null;
	
	//constructor
	public IntNode(int dataValue, int key)
	{
		this.dataValue = dataValue;
		this.key = key;
	}
	
	//get and set methods
	public int getDataValue()
	{
		return dataValue;
	}
	
	public IntNode getNext()
	{
		return next;
	}
	
	public void setDataValue(int dataValue)
	{
		this.dataValue = dataValue;
	}
	
	public void setNext(IntNode next)
	{
		this.next = next;
	}
	
	//tostring
	@Override
	public String toString()
	{
		return "" + dataValue;
	}
}
