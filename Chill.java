package OnlineSpotify;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Chill extends JFrame {
    public Chill() {
        setTitle("Chill Mood");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JLabel imageLabel = new JLabel(new ImageIcon("Chill.jpg")); // Place your image at icons/chill.png
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel, BorderLayout.NORTH);

        JTextArea area = new JTextArea();
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        add(scroll, BorderLayout.CENTER);

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("SELECT title, artist FROM songs WHERE mood='Chill'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                area.append(rs.getString("title") + " - " + rs.getString("artist") + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
