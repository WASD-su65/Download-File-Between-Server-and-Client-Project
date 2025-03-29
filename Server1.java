import java.io.*;
import java.net.*;
import java.util.*;

public class Server1{
    public static void sendFile(Socket socket, String filePath) throws IOException{
        File file = new File(filePath);
        byte[] buffer = new byte[1024];

        try(FileInputStream fis = new FileInputStream();
            OutputStream os = socket.getOutputStream()){

                int bytesRead;
                while((bytesRead = fis.read(buffer)) != 1){
                    os.write(buffer, 0, bytesRead);
                }
                os.flush();
        }
    }
     public static void main(String[] args) throws IOException{
          try{
          ServerSocket ss = new ServerSocket(4999);
          Socket s = ss.accept();

          InputStream is = s.getInputStream();
          
          byte[] buffer = new byte[1024];
          int bytesRead;
          FileOutputStream fos = new FileOutputStream("DpDance.mp4");

          while((bytesRead = is.read(buffer)) != -1){
                fos.write(buffer, 0, bytesRead);
          }
          fos.close();

          is.close();
          s.close();

          }
          catch(IOException e){
            e.printStackTrace();
          }
        }
}