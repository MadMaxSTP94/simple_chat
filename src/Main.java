import client.ClientWindow;

import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        server.Server server = new server.Server();
       // new server.ClientHandler(new Socket("localhost",3443),server);

    }
}
