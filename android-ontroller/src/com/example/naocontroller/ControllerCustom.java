package com.example.naocontroller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ControllerCustom extends Activity{
	private Button send;
	private EditText proxy;
	private EditText motion;
	private EditText para;
	private MessageSender sender = new MessageSender();
	private ArrayList<Client> clientList;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom);
		Bundle clientInfo = getIntent().getExtras();
		clientList = (ArrayList<Client>)clientInfo.getSerializable("clientList");
		
		send = (Button)findViewById(R.id.send);
		proxy = (EditText)findViewById(R.id.proxycontent);
		motion = (EditText)findViewById(R.id.motioncontent);
		para = (EditText)findViewById(R.id.paracontent);
		
	}
	
	public void clickSend(View view){
		String motion = this.motion.getText().toString();
		String proxy = this.proxy.getText().toString();
		String para = this.para.getText().toString();
		final String instruct = proxy+" "+motion+" "+para;
		new Thread(new Runnable(){
			@Override
			public void run(){
				sender.sendMessage(clientList, instruct);
			}
		}).start();
			
		
	}

}
