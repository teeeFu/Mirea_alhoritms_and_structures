package practice5;

// музыка
import javax.swing.*;
import java.util.ArrayList;

public class practice5_4 {
    public static void main(String[] args) {
        final int[] countOfClick = {0};
        ArrayList<String> paths = new ArrayList<>() {{

            add("/Users/aleksandrsolodovcenko/Downloads/ph1.jpg");
            add("/Users/aleksandrsolodovcenko/Downloads/ph2.png");
            add("/Users/aleksandrsolodovcenko/Downloads/ph3.jpeg");
            add("/Users/aleksandrsolodovcenko/Downloads/ph5.jpeg");
            add("/Users/aleksandrsolodovcenko/Downloads/ph10.png");

            add("/Users/aleksandrsolodovcenko/Downloads/ph8.jpeg");
            add("/Users/aleksandrsolodovcenko/Downloads/ph9.jpg");




        }};

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        Timer timer = new Timer(1500, ev -> {
            if (frame.getContentPane().getComponentCount() > 0) frame.getContentPane().remove(0);

            ImageIcon icon = new ImageIcon(paths.get(countOfClick[0]));
            JLabel label = new JLabel(icon);
            countOfClick[0] = (countOfClick[0] + 1) % paths.size();
            frame.add(label);

            frame.revalidate();
        });

        frame.setVisible(true);
        timer.start();
    }
}
