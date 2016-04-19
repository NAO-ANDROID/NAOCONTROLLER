package com.example.naocontroller;

import java.io.Serializable;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ControllerMenu extends Activity{
	private Button simpleMoveButton;
	private Button simpleTalkButton;
	private Button simpleYuyinButton;
	private Button custom;
	private ArrayList<Client> clientList;
	private TextView propt;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.controlmenu);
		//get client list from connect;
		Bundle clientInfo = getIntent().getExtras();
		clientList = (ArrayList<Client>)clientInfo.getSerializable("clientList");
		
		//get view
		simpleMoveButton = (Button)findViewById(R.id.simpleMoveController);
		//simpleTalkButton = (Button)findViewById(R.id.simpleTalkController);
		simpleYuyinButton = (Button)findViewById(R.id.simpleYuYinController);
		custom = (Button)findViewById(R.id.customController);
		propt = (TextView)findViewById(R.id.textView1);
		propt.setText(clientList.get(0).host);
		
	}
	
	public void clickMove(View view){
		Intent turnMoveIntent = new Intent(ControllerMenu.this,ControllerMove.class);
		Bundle bundle = new Bundle();
		bundle.putSerializable("clientList", (Serializable)clientList);
		turnMoveIntent.putExtras(bundle);
		ControllerMenu.this.startActivity(turnMoveIntent);
		ControllerMenu.this.finish();
	}
	public void clickTalk(View view){
		
	}
	public void clickYuyin(View view){
		Intent intent = new Intent(ControllerMenu.this,ControllerVoice.class);
		Bundle bundle = new Bundle();
		bundle.putSerializable("clientList", (Serializable)clientList);
		intent.putExtras(bundle);
		ControllerMenu.this.startActivity(intent);
		ControllerMenu.this.finish();
		
	}
	public void clickCustom(View view){
		Intent intent = new Intent(ControllerMenu.this,ControllerCustom.class);
		Bundle bundle = new Bundle();
		bundle.putSerializable("clientList", (Serializable)clientList);
		intent.putExtras(bundle);
		ControllerMenu.this.startActivity(intent);
		ControllerMenu.this.finish();
		
	}
}
