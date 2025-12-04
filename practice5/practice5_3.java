package practice5;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class practice5_3 {
    public static void main(String[] args) {
        ImageIcon icon = null;

        if (args[0].startsWith("https")) {
            URL url = null;
            try {
                url = new URL(args[0]);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            icon = new ImageIcon(url);
        }
        else {
            icon = new ImageIcon(args[0]);
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);

        JLabel label = new JLabel(icon);
        frame.add(label);

        frame.setVisible(true);
    }
}
