package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args){
		ServerSocket server = null;
		try{
			server = new ServerSocket(4700);
			while(true){
			Socket socket = server.accept();
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("Client:"+is.readLine());
			}
		}catch(Exception e){
			
		}
		
	}
}
