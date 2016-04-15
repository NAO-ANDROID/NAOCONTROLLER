package com.example.naocontroller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ControllerMenu extends Activity{
	private Button simpleMoveButton;
	private Button simpleTalkButton;
	private Button simpleYuyinButton;
	private Button custom;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.controlmenu);
		Bundle clientInfo = getIntent().getExtras();
		
		//get view
		simpleMoveButton = (Button)findViewById(R.id.simpleMoveController);
		simpleTalkButton = (Button)findViewById(R.id.simpleTalkController);
		simpleYuyinButton = (Button)findViewById(R.id.simpleYuYinController);
		custom = (Button)findViewById(R.id.customController);
		
	}
	
	public void clickMove(View view){
		
	}
	public void clickTalk(View view){
		
	}
	public void clickYuyin(View view){
		
	}
	public void clickCustom(View view){
		
	}
}
