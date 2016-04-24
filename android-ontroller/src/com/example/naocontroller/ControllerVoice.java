package com.example.naocontroller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.coderqi.publicutil.voice.VoiceToWord;


public class ControllerVoice extends Activity implements OnClickListener{
	Button but = null;
	private ArrayList<Client> clientList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.voice);
		Bundle clientInfo = getIntent().getExtras();
		clientList = (ArrayList<Client>)clientInfo.getSerializable("clientList");
		//
		but = (Button) findViewById(R.id.send);
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
			//ÌýÐ´°´Å¥
			case R.id.send:
				System.out.print(clientList.get(0).ip);
				VoiceToWord voice = new VoiceToWord(ControllerVoice.this,"534e3fe2",clientList);
				voice.clientList = clientList;
				voice.GetWordFromVoice();
				break;
			}
	}
}
