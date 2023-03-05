import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler extends Thread {
	private final Socket clientSocket;

	ClientHandler(Socket socket) {
		this.clientSocket = socket;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(clientSocket.getInputStream());
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			while (scanner.hasNextLine()) {
				String inputLine = scanner.nextLine();
				System.out.println("Клиент ввел: " + inputLine);

				String[] parts = inputLine.split(" ");
				if (parts[0].equals("exit")){
					break;
				} else{
					if (parts.length==3){
						String operation = parts[0];
						double a = Double.parseDouble(parts[1]);
						double b = Double.parseDouble(parts[2]);
						double result = switch (operation) {
							case "add" -> Calculator.add(a, b);
							case "subs" -> Calculator.subs(a, b);
							case "mult" -> Calculator.mult(a, b);
							case "divide" -> Calculator.divide(a, b);
							default -> 0;
						};
						out.println(result);
					}
				}
			}
			System.out.println("Клиент отключился");
			clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

