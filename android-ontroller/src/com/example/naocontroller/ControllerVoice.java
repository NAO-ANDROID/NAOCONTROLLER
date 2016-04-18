package com.example.naocontroller;

import android.app.Activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.coderqi.publicutil.voice.VoiceToWord;


public class ControllerVoice extends Activity implements OnClickListener{
	Button but = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.voice);
		but = (Button) findViewById(R.id.button1);
		but.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	@Override
	public void onClick(View v) {
			switch (v.getId()) {
			//��д��ť
			case R.id.button1:
				VoiceToWord voice = new VoiceToWord(ControllerVoice.this,"534e3fe2");
				voice.GetWordFromVoice();
				break;
			}
	}
}
