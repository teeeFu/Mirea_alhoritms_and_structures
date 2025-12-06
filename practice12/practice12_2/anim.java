package practice12.practice12_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class anim extends JPanel implements ActionListener {
    private Image sprite;
    private int frweight = 920;
    private int frheight = 1290;
    private int totalframes = 8;
    private int currentframe = 0;
    private int x = 150;
    private int y = 100;
    private Timer timer;

    public anim() {
        ImageIcon icon = new ImageIcon("/Users/aleksandrsolodovcenko/Downloads/belka2.jpg");
        sprite = icon.getImage();

        timer = new Timer(200,this);
        timer.start();

        setPreferredSize(new Dimension(40000,30000));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (sprite != null) {
            int scrx = currentframe * frweight;
            int scry = 0;

            g.drawImage(sprite, x, y,x+frweight,y+frheight, scrx, scry,scrx+frweight,scry+frheight,this);
        }else {
            g.setColor(Color.RED);
            g.fillRect(x, y, frweight, frheight);
            g.setColor(Color.BLACK);
            g.drawString("Frame: " + currentframe, x, y - 10);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentframe = (currentframe + 1) %totalframes;
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Анимация");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new anim());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}