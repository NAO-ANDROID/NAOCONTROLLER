package com.example.naocontroller;

import java.io.Serializable;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Connect extends Activity {
	private Button singleButton;
	private Button multiButton;
	private Button connectSureButton;
	private TextView ipProp;
	private TextView hostProp;
	private EditText ipText;
	private EditText hostText;
	private ArrayList<Client> clientList = new ArrayList<Client>();
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect);
        
        singleButton = (Button)findViewById(R.id.single);
        multiButton = (Button)findViewById(R.id.multi);
        connectSureButton = (Button)findViewById(R.id.connectSure);
        ipProp = (TextView)findViewById(R.id.ipProp);
        hostProp = (TextView)findViewById(R.id.hostProp);
        ipText = (EditText)findViewById(R.id.idText);
        hostText = (EditText)findViewById(R.id.hostText);
        
        initView();
        
        
        
    }
    //Button event
    public void clickConnectSureButton(View view){
    	//turn to menuContoller;
//    	Intent mainIntent = new Intent(StartView.this,MainActivity.class);
//		StartView.this.startActivity(mainIntent);
//		StartView.this.finish();
    	Intent turnIntent = new Intent(Connect.this,ControllerMenu.class);
    	Bundle bundle = new Bundle();
    	Client client = new Client(ipText.getText().toString(),hostText.getText().toString());
    	ArrayList<Client> clientList = new ArrayList<Client>();
    	clientList.add(client);
    	bundle.putSerializable("clientList", (Serializable)clientList);
    	turnIntent.putExtras(bundle);
    	
    	Connect.this.startActivity(turnIntent);
    	Connect.this.finish();
    	
    }
    
    public void clickSingleButton(View view){
    	viewChange();
    }
    public void clickMultiButton(View view){
    	viewChange();
    }
    //event ending
    public void viewChange(){
    	singleButton.setVisibility(View.INVISIBLE);
//    	singleButton.setHeight(0);
//    	singleButton.setWidth(0);
    	
    	multiButton.setVisibility(View.INVISIBLE);
//    	multiButton.setHeight(0);
//    	multiButton.setWidth(0);
    	connectSureButton.setVisibility(View.VISIBLE);
    	ipProp.setVisibility(View.VISIBLE);
    	hostProp.setVisibility(View.VISIBLE);
    	ipText.setVisibility(View.VISIBLE);
    	hostText.setVisibility(View.VISIBLE);
    }
    public void initView(){
    	connectSureButton.setVisibility(View.INVISIBLE);
    	ipProp.setVisibility(View.INVISIBLE);
    	hostProp.setVisibility(View.INVISIBLE);
    	ipText.setVisibility(View.INVISIBLE);
    	hostText.setVisibility(View.INVISIBLE);
    }
    public void getSingleClient(){
    	String ip = ipText.getText().toString();
    	String host = hostText.getText().toString();
    	clientList.add(new Client(ip,host));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
