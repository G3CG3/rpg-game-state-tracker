# RPG Game State Tracker 🎮

A simple Java console application that uses `EnumMap` to manage RPG game states such as `START`, `PLAYING`, `PAUSE`, and `GAME_OVER`. Great for learning efficient enum usage and building foundational state management in games.

## 📦 Requirements

- Java 8 or higher
- A terminal or IDE that supports Java

## 🚀 How to Run
- Compile the project in your IDE (e.g., IntelliJ).
- Run the RPGApp class.
- Observe the console output showing different behaviors for each game state.

## ✅ Sample Output
>[START] Welcome to the RPG Game! <br>
>[PLAYING] The adventure begins... <br>
>[PAUSE] Game is paused. Take a break. <br>
>[GAME_OVER] Game over. Try again!

## 🎓 Concepts Demonstrated
- EnumMap usage for efficient enum-based mapping
- Clean, readable structure
- Easy to extend with new states or actions
- Clean object-oriented design

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Feel free to expand this project!

## 💡 Ideas to Extend
- Add new game phases like INVENTORY, BATTLE, or VICTORY

- Include time tracking or logs per phase

- Trigger actions per state using Runnable or lambda functions

- Integrate user input to simulate real-time phase transitions

- Refactor for GUI support using JavaFX or Swing
