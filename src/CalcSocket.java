import java.io.IOException;

public class CalcSocket {
	public static void main(String[] args) throws IOException {
		CalculatorServer calculatorServer = new CalculatorServer();
		calculatorServer.startServer(22);
	}
}
