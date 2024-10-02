import javax.swing.JFrame;

public class SnakeGameFrame extends JFrame {

    public SnakeGameFrame() {
        add(new SimpleSnakeGame());
        setResizable(false);
        pack();

        setTitle("Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame ex = new SnakeGameFrame();
        ex.setVisible(true);
    }
}
