package servertext;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerNew {
  private ServerSocket serverSocket;
  public static final int PORT =  4242;
  public static final String FILES_PATH = "./files/server";

  public ServerNew() {
    try{
      serverSocket = new ServerSocket(PORT);
      acceptConnections();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void acceptConnections() throws IOException{
    while (true) {
      Socket clienSocket = serverSocket.accept();
      if (clienSocket.isConnected()) 
        new Thread( ()->{

          ClientConnection client = new ClientConnection(clienSocket);
          client.sendFile();

        } ).start();
    }
  }
  public static void main(String[] args) {
    new ServerNew();
  }
}
