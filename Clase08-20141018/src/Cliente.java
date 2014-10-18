package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Cliente {

	public Cliente() {
		try {
			Socket socket = new Socket("localhost", 10000); 
			DataInputStream inputStream = new DataInputStream(socket.getInputStream());
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			
			System.out.println(inputStream.readUTF()); // Espera el hola del servidor
			outputStream.writeUTF("Hola"); //Responde hola
			System.out.println("Hola"); //Para que sea vea por pantalla 
			
			System.out.println(inputStream.readUTF()); //Espera el como estas
			outputStream.writeUTF("Bien"); //Resonde Bien
			System.out.println("Bien"); //Para que se vea por pantalla
			
			System.out.println(inputStream.readUTF()); //Espera el chau
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cliente(); //Ejecutar 5 veces el main para simular 5 clientes en paralelo
	}

}
