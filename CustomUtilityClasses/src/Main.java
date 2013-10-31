import hashtable.Node;


//for testing purposes only
public class Main
{
	public static void main(String[] args)
	{
//		Thread t = new Thread(new AudioPlayer.AudioPlayer("C:/Users/Cat/Desktop/LoginScreenLoop.wav"));
//		t.start();
		Node<Integer> test = new Node<Integer>(1, 2, null);
		System.out.println(test.getData());
		System.out.println(test.getNextNode());
	}
}
