package com.example.naocontroller;

import java.util.ArrayList;

public class ControllerTalk {
	private MessageSender messageSender = new MessageSender();
	
	public void speak(String request,final ArrayList<Client> clientList){
		if(request.equals("自我介绍")){
			final String prepareInstruct = "ALTextToSpeech say -p 'Chinese';";			
			String instruct = "大家好，我是闹机器人，这是用来测试安卓控制器的程序，如果出现小的" +
					"问题，请耐心等待。";
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
		
		if(request.equals("天气预报")){
			
		}
	}

}
