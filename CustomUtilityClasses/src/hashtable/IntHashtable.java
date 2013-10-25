package hashtable;

public class IntHashtable
{
	private static double DEFAULT_LOADFACTOR = 0.75;
	private static int DEFAULT_STARTSIZE = 20;
	private double loadFactor =0;
	private int initialSize = 0;
	private IntNode[] hTable = null;
	
	
	//constructors
	public IntHashtable(int initialSize, double loadFactor)
	{
		this.loadFactor=loadFactor;
		this.initialSize=initialSize;
		
		hTable = new IntNode[initialSize];
	}
	
	public IntHashtable(double loadFactor)
	{
		this(DEFAULT_STARTSIZE, loadFactor);
	}
	
	public IntHashtable()
	{
		this(DEFAULT_STARTSIZE, DEFAULT_LOADFACTOR);
	}
	
	
}
