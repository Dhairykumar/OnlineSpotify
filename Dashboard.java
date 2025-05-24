package OnlineSpotify;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    public Dashboard() {
        setTitle("Spotify Mood Detector");
        setSize(600, 400);
        setLayout(new GridLayout(2, 3, 10, 10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMoodButton("Cool", "Icon/Cool.jpg", new Cool());
        addMoodButton("Romantic", "Icon/Romantic.jpg", new Romantic());
        addMoodButton("Chill", "Icon/Chill.jpg", new Chill());
        addMoodButton("Sad", "Icon/Sad.jpg", new Sad());
        addMoodButton("HipHop", "Icon/Hip_Hop.jpeg", new HipHop());
    }

    private void addMoodButton(String mood, String iconPath, JFrame frameToOpen) {

        ImageIcon rawIcon = new ImageIcon(iconPath);
        Image scaledImg = rawIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);


        JButton button = new JButton(mood, icon);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(Color.BLACK);


        switch (mood.toLowerCase()) {
            case "cool":
                button.setBackground(new Color(173, 216, 230));
                button.setForeground(Color.black);
                break;
            case "romantic":
                button.setBackground(new Color(255, 182, 193));
                break;
            case "chill":
                button.setBackground(new Color(144, 238, 144));
                break;
            case "sad":
                button.setBackground(new Color(211, 211, 211));
                break;
            case "hip hop":
                button.setBackground(new Color(255, 0, 100));
                break;
            default:
                button.setBackground(Color.LIGHT_GRAY);
        }


        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setFocusPainted(false);


        button.addActionListener(e -> frameToOpen.setVisible(true));


        add(button);
    }
}
