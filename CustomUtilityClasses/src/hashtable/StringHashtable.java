package hashtable;

public class StringHashtable
{
	private static final int DEFAULT_INITIAL_SIZE = 20;
	private static final double DEFAULT_LOADFACTOR = 0.75;
	private StringNode[] hTable;
	private double loadFactor;
	private int load = 0;
	private int tableSize;

	public StringHashtable(int tableSize, double loadFactor)
	{
		this.loadFactor = loadFactor;
		this.tableSize = tableSize;

		hTable = new StringNode[tableSize];
	}

	public StringHashtable(double loadFactor)
	{
		this(DEFAULT_INITIAL_SIZE, loadFactor);
	}

	public StringHashtable(int tableSize)
	{
		this(tableSize, DEFAULT_LOADFACTOR);
	}

	public StringHashtable()
	{
		this(DEFAULT_INITIAL_SIZE, DEFAULT_LOADFACTOR);
	}

	public void add(String value, String key)
	{
		StringNode current;
		//if loadfactor is exceeded, extend the table
		if (checkLoadFactor() > loadFactor)
			extendTable();
		//create hashkey for the given key
		int hKey = hashString(key);
		//if the first element at the hKey position is null, replace with new node
		if (hTable[hKey] == null)
		{
			hTable[hKey] = new StringNode(value, key, null);
			load++;
		}
		//if its not, loop the linked list til you get the last element.
		else
		{
			current = hTable[hKey];
			while (current.getNextNode() != null)
				current = current.getNextNode();
			//set the element AFTER the last element to a new node
			current.setNextNode(new StringNode(value, key, null));
			load++;
		}

	}
	public String getValue(String key)
	{
		int hk = hashString(key);
		StringNode temp = hTable[hk];
		while(temp != null)
		{
			if(temp.getKey().equals(key))
				return temp.getValue();
			temp = temp.getNextNode();
		}
		return null;
	}

	private void extendTable()
	{
		StringNode[] temp = new StringNode[hTable.length * 2];
		StringNode current;
		tableSize = temp.length;
		for (int i = 0; i < hTable.length; i++)
		{
			current = hTable[i];
			if(current != null)
			{
				int hKey = hashString(current.getKey());
				temp[hKey] = current;
				current = current.getNextNode();
			}
		}
		hTable = temp;
	}

	private int hashString(String key)
	{
		int prime = 71;
		int result = 1;
		for (int i = 0; i < key.length(); i++)
		{
			result = (int) (result + ((int)key.charAt(i))*Math.pow(prime, (key.length()-1-i)));
		}
		return (result % tableSize);

	}

	private double checkLoadFactor()
	{
		return (double) load / (double) hTable.length;
	}

	public static void main(String[] args)
	{
		StringHashtable ht = new StringHashtable();
		System.out.println(ht.checkLoadFactor());
		ht.add("testData", "testKey");
		System.out.println(ht.checkLoadFactor());
		ht.add("DATA", "testKeyThisIsaLONGassKEYwhatWIllYOUDO!!!!!yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyrrrrrrrrrrrrrrrrrrrrrrrrrrrrrruuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuur");
		System.out.println(ht.checkLoadFactor());
		System.out.println(ht.getValue("testKey"));
		ht.add("testData2", "testKey2");
		ht.add("testData3", "testKey3");
		ht.add("testData4", "testKey4");
		ht.add("testData5", "testKey5");
		System.out.println(ht.getValue("testKey2"));
		System.out.println(ht.getValue("testKey3"));
		System.out.println(ht.getValue("testKey4"));
		System.out.println(ht.getValue("testKey5"));
		System.out.println(ht.checkLoadFactor());
		
	}
}
