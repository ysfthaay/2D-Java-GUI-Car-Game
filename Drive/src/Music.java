import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Music extends CarGame{
    public Music(String title) {
        super("Drive And Survive");
    }
    public static void playBackgroundMusic() {
        try {
            File soundFile = new File("assets/background.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip backgroundMusic = AudioSystem.getClip();
            backgroundMusic.open(audioStream);
            backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

