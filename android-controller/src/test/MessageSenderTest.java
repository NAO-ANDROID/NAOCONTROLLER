package test;

import java.util.ArrayList;

import com.example.naocontroller.Client;
import com.example.naocontroller.MessageSender;

public class MessageSenderTest {
	private static MessageSender sender = new MessageSender();
	public static void main(String[] args){
		ArrayList<Client> clientList  = new ArrayList<Client>();
		Client c = new Client("127.0.0.1","4700");
		clientList.add(c);
		
		sender.sendMessage(clientList,"hello");
		
	}
}
