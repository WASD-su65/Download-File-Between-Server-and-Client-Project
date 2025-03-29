import java.io.*;
import java.net.*;

public class FileServer {
    
    public static void sendFile(Socket socket, String filePath) throws IOException {
        File file = new File(filePath);
        byte[] buffer = new byte[4096];
        
        try (FileInputStream fis = new FileInputStream(file);
             OutputStream os = socket.getOutputStream()) {
            
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.flush(); // ทำให้แน่ใจว่าข้อมูลทั้งหมดถูกส่งไป
        }
    }

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(4999)) {
            System.out.println("Server is listening on port " + 4999);
            
            // รอการเชื่อมต่อจาก Client
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            // ส่งไฟล์วิดีโอ
            sendFile(socket, "DanceDp.mp4"); // เปลี่ยนเป็น path ของไฟล์วิดีโอที่ต้องการส่ง

            System.out.println("File sent successfully");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}