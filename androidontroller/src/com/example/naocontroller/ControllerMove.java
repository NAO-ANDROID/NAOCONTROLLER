package com.example.naocontroller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ControllerMove extends Activity{
	private Button moveToward;
	private Button moveLeft;
	private Button moveRight;
	private Button moveBack;
	private Button stop;
		
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.controllermove);
		
		//get view
		moveToward = (Button)findViewById(R.id.movetoward);
		moveLeft = (Button)findViewById(R.id.moveleft);
		moveRight = (Button)findViewById(R.id.moverigth);
		moveBack = (Button)findViewById(R.id.moveback);
		stop = (Button)findViewById(R.id.stopButton);
	}
	
	public void clickMoveToward(View view){
		
	}
	public void clickMoveLeft(View view){
		
	}
	public void clickMoveRight(View view){
		
	}
	public void clickMoveBack(View view){
		
	}
	public void clickStop(View view){
		
	}
}
