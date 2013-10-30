package AudioPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer implements Runnable
{
	AudioInputStream auInStream;
	SourceDataLine auOutLine;

	private final int BUFFER_SIZE = 524288; // 128Kb

	public AudioPlayer(String file)
	{

		try
		{
			// laver en file ud fra den givne path
			File soundFile = new File(file);
			if (!soundFile.exists())
				throw new FileNotFoundException();
			// opretter en audioinputstream for den givne fil, dette er "in"
			auInStream = AudioSystem.getAudioInputStream(soundFile);
			// opretter et format object for inputstream'en
			AudioFormat auFormat = auInStream.getFormat();
			// opretter et dataline.info object til at holde data for
			// sourceline.
			DataLine.Info sourceInfo = new DataLine.Info(SourceDataLine.class,
					auFormat);
			// opretter en sourceDataLine, dette er "out"
			auOutLine = (SourceDataLine) AudioSystem.getLine(sourceInfo);
			auOutLine.open();

		} catch (LineUnavailableException e)
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e)
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (FileNotFoundException e)
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e)
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public void run()
	{
		auOutLine.start();
		int bytesRead = 0;
		boolean stop = false;
		byte[] data = new byte[BUFFER_SIZE];

		try
		{
			while (!stop)
			{
				// reads one buffer worth of data from the input line, into the
				// data array
				bytesRead = auInStream.read(data, 0, data.length);

				// bytesRead only becomes -1 when there's no more data to read
				// (end of stream)
				if (bytesRead >= 0)
				{
					// writes the data to the output line
					auOutLine.write(data, 0, bytesRead);
				} else
				{
					stop = true;
				}
			}
		} catch (IOException e)
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally
		{
			auOutLine.close();
		}

	}

}
