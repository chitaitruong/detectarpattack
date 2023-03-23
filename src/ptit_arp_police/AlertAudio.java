/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptit_arp_police;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author ASUS
 */
public class AlertAudio {
    
	Clip clip;
        
	AudioInputStream audioInputStream;
        
	static String filePath="C:\\Users\\ASUS\\Desktop\\Thisisatest.wav";

	// constructor to initialize streams and clip
	public AlertAudio() throws UnsupportedAudioFileException,IOException, LineUnavailableException
	{
		// create AudioInputStream object
		audioInputStream =AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
		
		// create clip reference
		clip = AudioSystem.getClip();
		
		// open audioInputStream to the clip
		clip.open(audioInputStream);
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
        public void play()
	{
		//start the clip
		clip.start();
	}
        public void stop() throws UnsupportedAudioFileException,
	IOException, LineUnavailableException
	{
		clip.stop();
                clip.close();
	}
}
