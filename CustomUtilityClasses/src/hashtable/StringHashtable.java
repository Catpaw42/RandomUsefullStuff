package hashtable;

public class StringHashtable
{
	private static final int DEFAULT_INITIAL_SIZE = 20;
	private static final double DEFAULT_LOADFACTOR = 0.75;
	private StringNode[] hTable;
	private double loadFactor;
	private int tableSize;

	public StringHashtable(int initialSize, double loadFactor)
	{
		this.loadFactor = loadFactor;
		tableSize = initialSize;

		hTable = new StringNode[tableSize];
	}

	public StringHashtable(double loadFactor)
	{
		this(DEFAULT_INITIAL_SIZE, loadFactor);
	}

	public StringHashtable(int initialSize)
	{
		this(initialSize, DEFAULT_LOADFACTOR);
	}

	public StringHashtable()
	{
		this(DEFAULT_INITIAL_SIZE, DEFAULT_LOADFACTOR);
	}
	
	

	private double checkLoadFactor()
	{
		int count = 0;
		for(int i = 0; i<hTable.length; i++)
		{
			if(hTable[i]!= null)
				count++;
		}
		return (double)count/(double)hTable.length;
	}

	public static void main(String[] args)
	{
		StringHashtable ht = new StringHashtable();
		System.out.println(ht.checkLoadFactor());
	}
}
