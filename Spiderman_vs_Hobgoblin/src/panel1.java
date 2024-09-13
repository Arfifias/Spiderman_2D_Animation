import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panel1 extends JPanel implements ActionListener {

    final int WIDTH = 1000;
    final int HEIGHT = 800;
    int xVelocity = 8;
    int yVelocity = 5;
    int xVelocity2 = 5;
    int yVelocity2 = 8;
    int x = 0;
    int y = 0;
    int x2 = 0;
    int y2 = 0;
    Timer myTimer;
    Image hobgoblin;
    Image spider_man;

    //Variables


    panel1() {


        hobgoblin = new ImageIcon("Images\\Hobgoblin.jpg").getImage();
        spider_man = new ImageIcon("Images\\Spiderman.jpg").getImage();

        myTimer = new Timer(10, this);
        myTimer.start();


        //We need the timer to start a loop
        //The Images above are the jpg files for the animation

        this.setBackground(new Color(0, 0, 0));//Black background
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));//GUI Dimension
    }

    public void paint(Graphics g) {

        super.paint(g);
        Graphics2D myGraphics = (Graphics2D) g;
        myGraphics.drawImage(hobgoblin, x, y, null);
        myGraphics.drawImage(spider_man, x2, y2, null);

        //Drawing the images, which means inserting the images in a certain position

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x >= WIDTH - hobgoblin.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if (y >= HEIGHT - hobgoblin.getWidth(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }

        y = y + yVelocity;

        if (x2 >= WIDTH - spider_man.getWidth(null) || x2 < 0) {
            xVelocity2 = xVelocity2 * -1;
        }
        x2 = x2 + xVelocity2;

        if (y2 >= HEIGHT - spider_man.getWidth(null) || y2 < 0) {
            yVelocity2 = yVelocity2 * -1;
        }

        y2 = y2 + yVelocity2;

        //Basically the method which makes the jpg files to move around the frame



        repaint();//This line refreshes the GUI

    }


}
