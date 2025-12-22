package practice5;

// https://masterpiecer-images.s3.yandex.net/5ff700465bfe0fc:upscaled



import javax.sound.sampled.*;
import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class practice5_3 {
    public static void main(String[] args) {
        // ДОБАВИЛ ЭТУ СТРОКУ - запускает звук в фоне
        new Thread(() -> { beep(440,500); beep(523,300); beep(659,700); }).start();


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

    // ДОБАВИЛ ЭТОТ МЕТОД
    static void beep(int freq, int durationMs) {
        try {
            AudioFormat af = new AudioFormat(44100, 16, 1, true, false);
            SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
            sdl.open(af);
            sdl.start();
            int samples = durationMs * 44;
            byte[] buffer = new byte[samples * 2];
            for (int i = 0; i < samples; i++) {
                double angle = 2.0 * Math.PI * freq * i / 44100;
                short sample = (short) (Short.MAX_VALUE * 0.5 * Math.sin(angle));
                buffer[2 * i] = (byte) (sample & 0xFF);
                buffer[2 * i + 1] = (byte) ((sample >> 8) & 0xFF);
            }
            sdl.write(buffer, 0, buffer.length);
            sdl.drain();
            sdl.close();
        } catch (Exception e) {

        }
    }
}