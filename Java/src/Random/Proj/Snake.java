import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Snake extends JPanel implements ActionListener {

    static final int WIDTH = 700;
    static final int HEIGHT = 700;
    static final int  UNIT_SIZE = 20;
    static final int G_U = (WIDTH * HEIGHT) / UNIT_SIZE;

    int[] x = new int[G_U];
    int[] y = new int[G_U];

    int body = 150;
    int AppleEaten;
    int AppleX;
    int AppleY;

    char direction  = 'S';
    boolean running = false;

    Timer Rate;
    Random location;

    public Snake() {
        location = new Random();
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        StartGame();
    }
    public void StartGame() {
        for(int i = 0; i < body; i++) {
            x[i] = 100 - i * UNIT_SIZE;
            y[i] = 100;
        }
        AppleS();
        running = true;
        Rate = new Timer(80, this);
        Rate.start();
    }
    public void AppleS() {
        AppleX = location.nextInt(WIDTH / UNIT_SIZE) * UNIT_SIZE;
        AppleY = location.nextInt(HEIGHT / UNIT_SIZE) * UNIT_SIZE;
    }
    public void move() {
        for(int i = body; i > 0; i--) {
            x[i] = x[i -1];
            y[i] = y[i - 1];
        }
        switch(direction) {
            case 'W' -> y[0] -= UNIT_SIZE;
            case 'S' -> y[0] += UNIT_SIZE;
            case 'A' -> x[0] -= UNIT_SIZE;
            case 'D' -> x[0] += UNIT_SIZE;
        }
    }
    public void CheckApple() {
        if(x[0] == AppleX && y[0] == AppleY) {
            body++;
            AppleEaten++;
            AppleS();
        }
    }
    public void CheckCollision() {
        for(int i = body; i > 0; i--) {
            if(x[0] == x[i] && y[0] == y[i]) {
                running = false;
            }
        }
        if(x[0] < 0 || x[0] >= WIDTH || y[0] < 0 || y[0] >= HEIGHT) {
            running = false;
        }
        if(!running) {
            Rate.stop();
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(running) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Score: " + AppleEaten, 10, 20);
            g.setColor(Color.RED);
            g.fillOval(AppleX, AppleY, UNIT_SIZE, UNIT_SIZE);        
            for(int i = 0; i < body; i++) {
                if(i == 0) {
                    g.setColor(Color.GREEN);
                }
                else {
                    g.setColor(new Color(45,180,0));
                }
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }
        } 
        else {
            GameOver(g);
        }
    }
    public void GameOver(Graphics g) {
        g.setColor(Color.GREEN);

        g.drawString("GAME OVER", 200, 320);
    }
    public void GameRestart() {
        body = 300;
        AppleEaten = 0;
        direction = 'S';

        for(int i = 0; i < body; i++) {
            x[i] = 100 - 1 * UNIT_SIZE;
            y[i] = 100;
        }
        AppleS();
        running = true;
        Rate.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(running) {
            move();
            CheckApple();
            CheckCollision();
        }
        repaint();
    }
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_A:
                if(direction != 'D') direction = 'A';
                break;
                case KeyEvent.VK_D:
                if(direction != 'A') direction = 'D';
                break;
                case KeyEvent.VK_W:
                if(direction != 'S') direction = 'W';
                break;
                case KeyEvent.VK_S:
                if(direction != 'W') direction = 'S';
                break;
                case KeyEvent.VK_R:
                if(!running) {
                    GameRestart();
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
        JFrame Frame = new JFrame("Snake");
        Snake game = new Snake();

        Frame.add(game);
        Frame.pack();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLocationRelativeTo(null);
        Frame.setResizable(false);
        Frame.setVisible(true);
    }
}