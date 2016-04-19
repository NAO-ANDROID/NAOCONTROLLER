package com.example.naocontroller;

import java.util.ArrayList;

public class ControllerTalk {
	private MessageSender messageSender = new MessageSender();
	
	public void speak(String request,final ArrayList<Client> clientList){
		if(request.equals("自我介绍")){
			//final String prepareInstruct = "ALTextToSpeech say -p 'Chinese';";			
			String instruct = "Hello ,My name is NAO ,this is a test program. ";
					
			final String mainInstruct  = "ALTextToSpeech say -p '"+instruct+"';";
			new Thread(new Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub					
				//	messageSender.sendMessage(clientList,prepareInstruct);
					messageSender.sendMessage(clientList, mainInstruct);
					
				}
				
			}).start();
		}
		
		if(request.equals("天气预报")){
			final String instruct = "Let's take a look at the weather for the next 24 hours." +
					"It would be cloudy at the time with the temperature from fifteen to twenty-five.A strong wind would reach here,which could cause much rain.";
			final String maininstruct = "ALTextToSpeech say -p '" + instruct + "';" ;
			new Thread(new Runnable(){
				@Override
				public void run(){
					messageSender.sendMessage(clientList, maininstruct);
				}
			}).start();
		}
	}

}
