package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
	private int numeroCliente;
	private Socket socket;

	public ServerThread(Socket socket, int numeroCliente) {
		this.socket = socket;
		this.numeroCliente = numeroCliente;
	}

	public void run() {
		try {
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			DataInputStream inputStream = new DataInputStream(socket.getInputStream());

			outputStream.writeUTF("Hola C" + numeroCliente); //Envia el saludo
			inputStream.readUTF(); //Espera la respuesta
			sleep(2000); // Espera 2 segundos

			outputStream.writeUTF("Como estas C" + numeroCliente + "?"); // Pregunta como esta
			inputStream.readUTF(); // Espera la respuesta
			sleep(2000); // Espera 2 segundos
			outputStream.writeUTF("Chau C" + numeroCliente); // Lo despide porque el cliente es cortante

			socket.close(); // Cierra el socket
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
