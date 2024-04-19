import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Game extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener {
    private BufferedImage back;
    private ImageIcon Background;
    private boolean startgame;
    private boolean start, win, moveRight;
    private char screen;

    public Game() {
        back = null;
        new Thread(this).start();
        Background = new ImageIcon("Background.jpg");
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        start = false; 
        screen = 'S';
    }

    public void screen(Graphics g2d) {
        switch (screen) {
            case 'S':
                g2d.drawImage(Background.getImage(), 0, 0, getWidth(), getHeight(), this);
                drawStartScreen(g2d);
                break;
        }
    }

    public void drawStartScreen(Graphics g2d) {
        
        g2d.setFont(new Font("Broadway", Font.BOLD, 35));
        g2d.setColor(Color.white);
        g2d.drawString("Welcome to zombie attack !", 50, 300);
        g2d.drawString("Press SPACE to Begin", 200, 400);
    }

    @Override //chat gpt
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        screen(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Start the game when SPACE key is pressed
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            start = true;
            // Add code here to start the game logic or transition to the next screen
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}
