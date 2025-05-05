📁 Download File Between Server and Client Project

This project demonstrates file transfer between a Server and a Client using Java sockets. It allows efficient file transmission from the Server to the Client over a TCP connection.

🛠️ Features

Supports file transfer from Server to Client via TCP Socket
Clearly separated structure for Server and Client components
Allows customization of port numbers and IP addresses
📂 Project Structure
<pre>├── Client.java
├── ClientConnection.java
├── FileServer.java
├── Server.java
├── Server1.java
├── ServerNew.java</pre>

Description of Key Files:

-`Client.java` – Main class for the Client; connects to the Server and receives files

-`ClientConnection.java` – Manages the connection and data receiving from the Server

-`FileServer.java` – Main class for the Server; responsible for sending files to the Client

-`Server.java`, `Server1.java`, `ServerNew.java` – Various Server versions for testing and development

🚀 How to Use

1. Compile
Use the following command to compile all Java files:
<pre> javac *.java </pre>

2. Run the Server
Start the Server using:
<pre> java FileServer </pre>

java FileServer
3. Run the Client
Start the Client using:
<pre> java Client </pre>
Note: Make sure the Server is running before starting the Client.

✅ Requirements
- Java Development Kit (JDK) version 8 or above
- Any Java-supported operating system (Windows, macOS, Linux)

📌 Additional Notes
This is a beginner-level project aimed at learning how to implement file transfers using Java Sockets.
You may enhance it to support multiple file types, add security features, or improve the interface.

📄 License
No specific license has been provided for this project. Please contact the project owner before using or redistributing.
