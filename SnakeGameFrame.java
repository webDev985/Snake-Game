import javax.swing.JFrame;

public class SnakeGameFrame extends JFrame {

    public SnakeGameFrame() {
        add(new SimpleSnakeGame());
        setResizable(false);
        pack();

        setTitle("Game of Snakes");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame ex = new SnakeGameFrame();
        ex.setVisible(true);
    }
}
