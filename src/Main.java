import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel panel = new GamePanel(); //Substitui a linha 9
        frame.add(panel); //Inserida
        frame.setResizable(false); //Inserida
        frame.pack(); //Inserida
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        });

    }
}
