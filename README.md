🎧 Spotify Mood Detector

A Java-based desktop application that detects a user's mood from input (e.g., text, facial expressions, or audio) and recommends Spotify songs accordingly. The system uses Swing for the user interface, MySQL for storing user and mood data, and optionally JavaFX for a modern UI experience.

📌 Features

Detect user mood from input (text/audio/facial expression)

Recommend Spotify songs based on detected mood

Store user moods and song interaction history

User registration and login system

Dashboard to view mood history and song suggestions

Integration with Spotify API for real-time song fetching

Admin panel to view user activity and system stats

🛠️ Tech Stack

Java (Swing/JavaFX)

MySQL (JDBC)

Spotify API (OAuth + REST API)

IDE: IntelliJ IDEA / Eclipse / NetBeans

JDK: Java 8+

🔧 Project Structure

bash
Copy
Edit
Spotify-Mood-Detector/
│
├── conn.java                  # DB connection handler  
├── Login.java                 # User login interface  
├── MoodDetector.java          # Main mood detection logic  
├── SpotifyRecommender.java    # Spotify API integration  
├── Dashboard.java             # User dashboard for mood history and songs  
├── AdminPanel.java            # Admin panel to view system stats  
├── MoodHistory.java           # Past mood tracking UI  
├── /icon                      # Icons and UI images  
├── /utils                     # Helper classes (e.g., API handlers, token managers)  
└── /models                    # Java Beans for user, mood, song  
