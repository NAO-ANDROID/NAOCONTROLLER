package com.example.naocontroller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ControllerMove extends Activity{
	private ImageButton moveToward;
	private ImageButton moveLeft;
	private ImageButton moveRight;
	private ImageButton moveBack;
	private ImageButton stop;
	private ArrayList<Client> clientList;
	private MessagePack messagePacker = new MessagePack();
	private MessageSender messageSender = new MessageSender();
		
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.controllermove);
		//get client list form controller menu;
		Bundle clientInfo = getIntent().getExtras();
		clientList = (ArrayList<Client>)clientInfo.getSerializable("clientList");
		
		//get view
		moveToward = (ImageButton)findViewById(R.id.movetoward);
		moveLeft = (ImageButton)findViewById(R.id.moveleft);
		moveRight = (ImageButton)findViewById(R.id.moverigth);
		moveBack = (ImageButton)findViewById(R.id.moveback);
		stop = (ImageButton)findViewById(R.id.stopButton);
	}
	
	public void clickMoveToward(View view){
		messageSender.sendMessage(clientList, messagePacker.moveToward());
	}
	public void clickMoveLeft(View view){
		messageSender.sendMessage(clientList, messagePacker.moveLeft());
	}
	public void clickMoveRight(View view){
		messageSender.sendMessage(clientList, messagePacker.moveRight());
	}
	public void clickMoveBack(View view){
		messageSender.sendMessage(clientList, messagePacker.moveBack());
	}
	public void clickStop(View view){
		messageSender.sendMessage(clientList, messagePacker.stop());
	}
}
