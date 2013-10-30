
//for testing purposes only
public class Main
{
	public static void main(String[] args)
	{
		Thread t = new Thread(new AudioPlayer.AudioPlayer("C:/Users/Cat/Desktop/LoginScreenLoop.wav"));
		t.start();
	}
}
