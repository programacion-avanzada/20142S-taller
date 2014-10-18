package socket;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	private static final int CONEXIONESMAXIMAS = 5;
	
	public Servidor() {
		try {
			ServerSocket serverSocket = new ServerSocket(10000); 
			for(int x = 0; x < CONEXIONESMAXIMAS; x++) {
				Socket socket = serverSocket.accept();
				new ServerThread(socket, x).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Servidor();
	}
}
