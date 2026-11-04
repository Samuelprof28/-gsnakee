import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    private Timer timer;

    public GamePanel() {
        setPreferredSize(new Dimension(GameConstants.WIDTH,GameConstants.HEIGHT));
    }

    timer = new Timer(GameConstants.START_DELAY, this);
    timer.start();

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}