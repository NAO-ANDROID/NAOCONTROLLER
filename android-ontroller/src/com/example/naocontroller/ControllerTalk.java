package com.example.naocontroller;

import java.util.ArrayList;

public class ControllerTalk {
	private MessageSender messageSender = new MessageSender();
	
	public void speak(String request,final ArrayList<Client> clientList){
		if(request.equals("���ҽ���")){
			final String prepareInstruct = "ALTextToSpeech say -p 'Chinese';";			
			String instruct = "��Һã������ֻ����ˣ������������԰�׿�������ĳ����������С��" +
					"���⣬�����ĵȴ���";
			final String mainInstruct  = "ALTextToSpeech say -p '"+instruct+"';";
			new Thread(new Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub					
					messageSender.sendMessage(clientList,prepareInstruct);
					messageSender.sendMessage(clientList, mainInstruct);
					
				}
				
			}).start();
		}
		
		if(request.equals("����Ԥ��")){
			
		}
	}

}
