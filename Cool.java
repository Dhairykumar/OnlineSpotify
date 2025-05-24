package OnlineSpotify;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Cool extends JFrame {
    public Cool() {
        setTitle("Cool Mood");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        add(scroll, BorderLayout.CENTER);

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("SELECT title, artist FROM songs WHERE mood='Cool'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                area.append(rs.getString("title") + " - " + rs.getString("artist") + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
