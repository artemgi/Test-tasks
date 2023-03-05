import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
	private ServerSocket serverSocket;

	public void startServer(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		System.out.println("Порт: " + port);

		while (true) {
			Socket socket = serverSocket.accept();
			System.out.println("Подключился клиент: " + socket.getInetAddress().getHostAddress());
			new ClientHandler(socket).start();
		}
	}


}