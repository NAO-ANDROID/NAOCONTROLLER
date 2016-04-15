package com.example.naocontroller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartView extends Activity{
//	private final int SPLASH_DISPLAY_LENDHT = 2000;
//	   @Override
//	  protected void onCreate(Bundle savedInstanceState) {
//	        super.onCreate(savedInstanceState);
//	        setContentView(R.layout.startview);
//	        new Handler().postDelayed(new Runnable(){
//	        	   public void run(){
//	        		   Intent mainIntent = new Intent(StartView.this,MainActivity.class);
//	        		   StartView.this.startActivity(mainIntent);
//	        		   StartView.this.finish();
//	        	   }
//	        },SPLASH_DISPLAY_LENDHT);
//	    }
	private final int SPLASH_DISPLAY_LENDHT = 2000;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startview);
		new Handler().postDelayed(new Runnable(){
			public void run(){
				Intent mainIntent = new Intent(StartView.this,Connect.class);
				StartView.this.startActivity(mainIntent);
				StartView.this.finish();
		}
		}, SPLASH_DISPLAY_LENDHT);
	}

}
