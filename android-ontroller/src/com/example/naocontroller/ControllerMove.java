package com.example.naocontroller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ControllerMove extends Activity{
	private ImageButton leftHand;
	private ImageButton rightHand;
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
	public void clickRightHand(View view){
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				messageSender.sendMessage(clientList, messagePacker.stretchRightHand());
				try{
				Thread.sleep(3000);
				}catch(Exception e){
					e.printStackTrace();
				}
				messageSender.sendMessage(clientList, messagePacker.putDownRightHand());
			}
			
		}).start();
	}
	public void clickLeftHand(View view){
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				messageSender.sendMessage(clientList, messagePacker.stretchLeftHand());
				try{
				Thread.sleep(3000);
				}catch(Exception e){
					e.printStackTrace();
				}
				messageSender.sendMessage(clientList, messagePacker.putDownLeftHand());
			}
			
		}).start();
	}
	public void clickMoveToward(View view){
		new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				messageSender.sendMessage(clientList, messagePacker.moveToward());
			}			
		}).start();
		
	}
	public void clickMoveLeft(View view){
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				messageSender.sendMessage(clientList, messagePacker.moveLeft());
			}
			
		}).start();
		
	}
	public void clickMoveRight(View view){
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				messageSender.sendMessage(clientList, messagePacker.moveRight());
			}
			
		}).start();
		
	}
	public void clickMoveBack(View view){
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				messageSender.sendMessage(clientList, messagePacker.moveBack());
			}
			
		}).start();
		
	}
	public void clickStop(View view){
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				messageSender.sendMessage(clientList, messagePacker.stop());
			}
			
		}).start();
		
	}
}
