**Drive and Survive - 2D Java Car Game**

Drive and Survive is a 2D car game developed using Java's GUI features. The primary objective is to avoid colliding with incoming vehicles and obstacles while maintaining a steady speed.

NOTE: Background Music file is excluded due to the file size limitations. Feel free to add music with 'background.wav' naming music class is already created and added to the files. You only need to add the music file to the assets folder.

🎮 Gameplay Features

Dynamic Difficulty: The game gets progressively harder as your score increases by adding more obstacles and increasing car speed.
Responsive Controls: The player's car is controlled using the left and right arrow keys.
Speed Mechanics: Difficulty is tied to the score, with speed increasing every 50 points (capped to ensure playability).
Game States: Includes a main menu to start the game and a "Game Over" screen that displays your final score and allows for a quick restart.

🛠️ Technologies Used

Language: Java 
GUI Framework: Swing 
Development Environment: IntelliJ IDEA 
Logic & Timing: Timer for the game loop and Random class for dynamic element placement.

🧠 Technical Highlights

Collision Detection: Implemented by checking if the bounding boxes of the player’s car and other objects overlap.
Boundary Management: Includes specific checks to prevent the player's car from moving off the screen.
Audio Implementation: Features background music that loops continuously. The music logic is handled in a separate class to apply inheritance principles.
Visual Updates: Road, trees, and obstacles move downward continuously to create the illusion of driving.

🚀 How to Run

Clone the repository.
Open the project in IntelliJ IDEA.
Ensure the assets folder contains the necessary files (e.g., menu.png, tree1.png, background.wav).
Run the application and press Enter to start.

Developer: Yusuf Taha Öncü
This project was successfully developed to meet objectives of creating a fun and technically engaging 2D game.
