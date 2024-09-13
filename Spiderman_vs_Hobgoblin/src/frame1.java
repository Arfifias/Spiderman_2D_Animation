import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class frame1 extends JFrame {

    public panel1 panel;
    public ImageIcon icon;

    frame1(){


        icon = new ImageIcon("Images\\Spiderman.jpg");
        panel = new panel1();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Spiderman vs Hobgoblin");
        this.setLocation(500,100);
        this.add(panel);
        this.setIconImage(icon.getImage());
        this.pack();
        this.setVisible(true);

    }

    public void audio() throws Exception {

        File file = new File("D:\\NewJavaProjects\\Spiderman_vs_Hobgoblin\\Audio\\Spiderman.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        while (con()) {
            clip.start();
        }

        //Soundtrack code above
        //The below con method makes an infinite loop for the soundtrack

    }
    public boolean con(){

        return true;
    }

}
