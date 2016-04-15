package com.example.naocontroller;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import android.os.Message;

public class MessageSender {
	public void sendMessage(ArrayList<Client> clientList,String msg){
		for(Client client : clientList){
			singleClientHandler(client,msg);
		}
	}
	public void singleClientHandler(Client client,String msg){
		int port = Integer.parseInt(client.host);
		String ip = client.ip;
		try {
			Socket socket = new Socket(ip,port);
			BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	    	writer.write(msg);
	    	writer.flush();
	    	writer.close();
	    	socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
